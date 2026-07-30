---
title: "System::Data::SqlClient::SqlConnectionStringBuilder classe"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Font per C++"
description: "System::Data::SqlClient::SqlConnectionStringBuilder classe. Costruttore di connessione basato su SQL. Gli oggetti di questa classe devono essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e usare questo puntatore per passarla alle funzioni come argomento in C++."
type: docs
weight: 100
url: /it/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


Costruttore di connessione basato su SQL. Gli oggetti di questa classe devono essere allocati solo usando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usare questo puntatore per passarla alle funzioni come argomento.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | Ottiene la sorgente dati (ad es. nome host e porta). |
| [get_Encrypt](./get_encrypt/)() const | Verifica se la crittografia è abilitata sulla linea. |
| [get_InitialCatalog](./get_initialcatalog/)() const | Ottiene il nome del database associato alla connessione. |
| [get_NetworkLibrary](./get_networklibrary/)() const | Ottiene il nome della libreria di rete utilizzata. |
| [get_Password](./get_password/)() const | Ottiene la password utilizzata per connettersi al database. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | Verifica se la connessione è protetta usando il certificato di fiducia del server. |
| [get_UserID](./get_userid/)() const | Ottiene l'ID utente utilizzato per la connessione. |
| [idx_get](./idx_get/)(String) override | Informazioni RTTI. |
| [idx_set](./idx_set/)(String, Object::ptr) override | Imposta l'oggetto chiave. |
| [set_DataSource](./set_datasource/)(const String\&) | Ottiene la sorgente dati (ad es. nome host e porta). |
| [set_Encrypt](./set_encrypt/)(bool) | Attiva o disattiva la crittografia. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | Imposta il nome del database associato alla connessione. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | Seleziona la libreria di rete da utilizzare. |
| [set_Password](./set_password/)(const String\&) | Imposta la password da utilizzare per connettersi al database. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | Determina se la connessione è protetta utilizzando il certificato di fiducia del server. |
| [set_UserID](./set_userid/)(const String\&) | Imposta l'ID utente da utilizzare per la connessione. |
## Vedi anche

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Font for C++](../../)
