---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension Klasse"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Font für C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension Klasse. Erweiterungsobjekt, um zusätzliche Informationen über die Verwendung eines Schlüssels zu speichern. Objekte dieser Klasse sollten nur über die System::MakeObject()-Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben in C++."
type: docs
weight: 1600
url: /de/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


Erweiterungsobjekt, um zusätzliche Informationen über die Verwendung eines Schlüssels zu speichern. Objekte dieser Klasse sollten nur über die [System::MakeObject()](../../system/makeobject/)‑Funktion alloziert werden. Erzeugen Sie niemals eine Instanz dieses Typs im Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse immer in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | Kopiert Erweiterungsdaten von einem anderen Objekt. |
| [get_KeyUsages](./get_keyusages/)() | Liefert Schlüsselverwendungen. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI-Informationen. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | Konstruktor. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | Konstruktor. |
## Siehe auch

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
