package com.episen.tp2.application.manager;

import com.episen.tp2.business.OrikaBeanMapper;
import com.episen.tp2.business.dao.DocumentDAO;
import com.episen.tp2.business.dto.DocumentDTO;
import com.episen.tp2.business.model.Document;
import com.episen.tp2.business.model.DocumentStatusEnum;
import org.springframework.stereotype.Service;

@Service
public class DocumentManagerImpl implements DocumentManager{

    private final OrikaBeanMapper orikaBeanMapper;

    private final DocumentDAO documentDAO;


    public DocumentManagerImpl(OrikaBeanMapper orikaBeanMapper, DocumentDAO documentDAO) {
        this.orikaBeanMapper = orikaBeanMapper;
        this.documentDAO = documentDAO;
    }


    @Override
    public DocumentDTO getDocumentById(Long documentId) {
        Document document = documentDAO.findById(documentId).orElse(null);
        return orikaBeanMapper.map(document, DocumentDTO.class);
    }

    @Override
    public DocumentDTO putDocumentById(Long documentId, DocumentDTO documentDTO) {
        Document documentToFind = documentDAO.findById(documentId).orElse(null);
        Document documentPut = orikaBeanMapper.map(documentDTO, Document.class);

        documentToFind.setBody(documentPut.getBody());
        documentToFind.setCreated(documentPut.getCreated());
        documentToFind.setCreator(documentPut.getCreator());
        documentToFind.setEditor(documentPut.getEditor());
        documentToFind.setDocumentlist(documentPut.getDocumentlist());
        documentToFind.setTitle(documentPut.getTitle());
        documentToFind.setUpdated(documentPut.getUpdated());
        documentToFind.setDocumentlist(documentPut.getDocumentlist());

        documentDAO.save(documentToFind);
        return orikaBeanMapper.map(documentToFind, DocumentDTO.class);
    }

    @Override
    public void putDocumentStatusById(Long documentId, DocumentStatusEnum documentStatusEnum) {
        Document documentToFind = documentDAO.findById(documentId).orElse(null);
        documentToFind.setStatusdocument(documentStatusEnum);
        documentDAO.save(documentToFind);
    }
}
