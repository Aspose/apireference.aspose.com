---
title: "System::Data::SqlClient::SqlConnectionStringBuilder klasse"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Page voor C++"
description: "System::Data::SqlClient::SqlConnectionStringBuilder klasse. Op SQL gebaseerde verbindingsbouwer. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 100
url: /nl/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


Op SQL gebaseerde verbindingsbouwer. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | Haalt gegevensbron op (bijv. hostnaam en poort). |
| [get_Encrypt](./get_encrypt/)() const | Controleert of encryptie is ingeschakeld op de lijn. |
| [get_InitialCatalog](./get_initialcatalog/)() const | Haalt de naam van de database op die aan de verbinding is gekoppeld. |
| [get_NetworkLibrary](./get_networklibrary/)() const | Haalt de naam van de gebruikte netwerklibrary op. |
| [get_Password](./get_password/)() const | Haalt het wachtwoord op dat wordt gebruikt om verbinding te maken met de database. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | Controleert of de verbinding beschermd is met een vertrouwd servercertificaat. |
| [get_UserID](./get_userid/)() const | Haalt de gebruikers‑ID op die voor de verbinding wordt gebruikt. |
| [idx_get](./idx_get/)(String) override | RTTI-informatie. |
| [idx_set](./idx_set/)(String, Object::ptr) override | Stelt het sleutelobject in. |
| [set_DataSource](./set_datasource/)(const String\&) | Haalt gegevensbron op (bijv. hostnaam en poort). |
| [set_Encrypt](./set_encrypt/)(bool) | Schakelt encryptie in of uit. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | Stelt de naam van de database in die aan de verbinding is gekoppeld. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | Selecteert de te gebruiken netwerklibrary. |
| [set_Password](./set_password/)(const String\&) | Stelt het wachtwoord in dat moet worden gebruikt om verbinding te maken met de database. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | Bepaalt of de verbinding beschermd is met een vertrouwd servercertificaat. |
| [set_UserID](./set_userid/)(const String\&) | Stelt de gebruikers‑ID in die voor de verbinding moet worden gebruikt. |
## Zie ook

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
