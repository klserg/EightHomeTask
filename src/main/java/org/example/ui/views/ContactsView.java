package org.example.ui.views;

import org.example.domains.Contact;

import java.util.List;

public interface ContactsView {
    void show(List<Contact> contactList);
    Contact readContact();
    Long readIdForRemove();
    String readDataForSearch();
}
