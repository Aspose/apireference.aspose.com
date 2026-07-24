---
title: "System::Data::SqlClient::SqlConnectionStringBuilder Klasse"
linktitle: "SqlConnectionStringBuilder"
second_title: "Aspose.Page für C++"
description: "System::Data::SqlClient::SqlConnectionStringBuilder Klasse. SQL-basierter Verbindungs‑Builder. Objekte dieser Klasse sollten ausschließlich mit der System::MakeObject()‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


SQL-basierter Verbindungs‑Builder. Objekte dieser Klasse sollten ausschließlich mit der [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion‑Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | Liefert die Datenquelle (z. B. Hostname und Port). |
| [get_Encrypt](./get_encrypt/)() const | Überprüft, ob die Verschlüsselung in der Zeile aktiviert ist. |
| [get_InitialCatalog](./get_initialcatalog/)() const | Liefert den Namen der mit der Verbindung verbundenen Datenbank. |
| [get_NetworkLibrary](./get_networklibrary/)() const | Liefert den Namen der verwendeten Netzwerkbibliothek. |
| [get_Password](./get_password/)() const | Liefert das Passwort, das zum Verbinden mit der Datenbank verwendet wird. |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | Überprüft, ob die Verbindung mit einem vertrauenswürdigen Serverzertifikat geschützt ist. |
| [get_UserID](./get_userid/)() const | Liefert die für die Verbindung verwendete Benutzer‑ID. |
| [idx_get](./idx_get/)(String) override | RTTI-Informationen. |
| [idx_set](./idx_set/)(String, Object::ptr) override | Setzt das Schlüsselobjekt. |
| [set_DataSource](./set_datasource/)(const String\&) | Liefert die Datenquelle (z. B. Hostname und Port). |
| [set_Encrypt](./set_encrypt/)(bool) | Schaltet die Verschlüsselung ein oder aus. |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | Setzt den Namen der mit der Verbindung verbundenen Datenbank. |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | Wählt die zu verwendende Netzwerkbibliothek aus. |
| [set_Password](./set_password/)(const String\&) | Setzt das Passwort, das für die Verbindung zur Datenbank verwendet wird. |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | Bestimmt, ob die Verbindung mit einem vertrauenswürdigen Serverzertifikat geschützt ist. |
| [set_UserID](./set_userid/)(const String\&) | Setzt die Benutzer-ID, die für die Verbindung verwendet wird. |
## Siehe auch

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
