package com.episen.tp2.api.rest;

import com.episen.tp2.application.manager.DocumentManager;
import com.episen.tp2.business.dto.DocumentDTO;
import com.episen.tp2.business.dto.DocumentList;
import com.episen.tp2.business.dto.Lock;
import com.episen.tp2.business.model.DocumentStatusEnum;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DocumentController {

    private final DocumentManager documentManager;

    public DocumentController(DocumentManager documentManager) {
        this.documentManager = documentManager;
    }

    //TODO ajouter en parametres la page et la taille de la page
    @GetMapping("documents")
    private List<DocumentDTO> getDocuments(){
        return null;
    }

    //TODO attention aux reponses http et dans quelle liste on ajoute????? ou juste une liste avec tous les documents?
    @PostMapping("documents")
    private DocumentList postDocuments(@RequestBody DocumentDTO documentDTO){
        return null;
    }

    //TODO attention aux reponses http
    @GetMapping("documents/{documentId}")
    private DocumentDTO getDocumentById(@PathVariable("documentId") Long documentId){
        return documentManager.getDocumentById(documentId);
    }

    //TODO attention aux reponses http
    @PutMapping("documents/{documentId}")
    private DocumentDTO putDocumentById(@PathVariable("documentId") Long documentId, @RequestBody DocumentDTO documentDTO){
        return documentManager.putDocumentById(documentId, documentDTO);
    }

    //TODO attention aux reponses http
    @PutMapping("documents/{documentId}/status")
    private void putDocumentStatusById(@PathVariable("documentId") Long documentId, @RequestBody DocumentStatusEnum documentStatusEnum){
        documentManager.putDocumentStatusById(documentId,documentStatusEnum);
    }

    //TODO reponses http et rapport avec un document avec document?????
    @GetMapping("documents/{documentId}/lock")
    private Lock getLockByDocumentId(@PathVariable("documentId") Long documentId){
        return null;
    }

    //TODO reponses http et rapport avec un document avec document?????
    @PutMapping("documents/{documentId}/lock")
    private Lock putLockByDocumentId(@PathVariable("documentId") Long documentId){
        return null;
    }

    //TODO reponses http et rapport avec un document avec document?????
    @DeleteMapping("documents/{documentId}/lock")
    private void deleteLockByDocumentId(@PathVariable("documentId") Long documentId){

    }
}
