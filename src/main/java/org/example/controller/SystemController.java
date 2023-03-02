package org.example.controller;

import org.example.domain.QuoteFile;
import org.example.service.SystemService;
public class SystemController {
    private SystemService service = new SystemService();

    public void save() {
        QuoteFile.save(service.getListToString().getBytes());
    }

    public void build() {
        QuoteFile.build(service.getListToString().getBytes());
    }

    public void load(){
        QuoteFile.setQuotes();
    }
}
