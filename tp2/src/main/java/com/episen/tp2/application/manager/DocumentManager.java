package com.episen.tp2.application.manager;

import com.episen.tp2.business.dto.DocumentDTO;
import com.episen.tp2.business.model.DocumentStatusEnum;

public interface DocumentManager {
    DocumentDTO getDocumentById(Long documentId);

    DocumentDTO putDocumentById(Long documentId, DocumentDTO documentDTO);

    void putDocumentStatusById(Long documentId, DocumentStatusEnum documentStatusEnum);
}
