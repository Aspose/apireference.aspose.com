---
title: "System::Net::Cookie Klasse"
linktitle: "Cookie"
second_title: "Aspose.Page für C++"
description: "System::Net::Cookie Klasse. Stellt ein HTTP-Cookie dar. Objekte dieser Klasse sollten nur über die Funktion System::MakeObject() alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 100
url: /de/cpp/system.net/cookie/
---
## Cookie class


Stellt ein HTTP-Cookie dar. Objekte dieser Klasse sollten nur über die Funktion [System::MakeObject()](../../system/makeobject/) alloziert werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertion-Fehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/) Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class Cookie : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Clone](./clone/)() | Erstellt eine Kopie der aktuellen Instanz. |
| [Cookie](./cookie/)() | Konstruiert eine neue Instanz. |
| [Cookie](./cookie/)(String, String) | Konstruiert eine neue Instanz. |
| [Cookie](./cookie/)(String, String, String) | Konstruiert eine neue Instanz. |
| [Cookie](./cookie/)(String, String, String, String) | Konstruiert eine neue Instanz. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergleicht Objekte anhand der C#-[Object.Equals](../../system/object/equals/)-Semantik. |
| [get_Comment](./get_comment/)() const | Liest den Wert des Attributs 'Comment'. |
| [get_CommentUri](./get_commenturi/)() const | Liest den Wert des Attributs 'CommentURL'. |
| [get_Discard](./get_discard/)() const | Liest den Wert des Attributs 'Discard'. |
| [get_Domain](./get_domain/)() const | Liest den Wert des Attributs 'Domain'. |
| [get_DomainImplicit](./get_domainimplicit/)() | Liest einen Wert, der angibt, ob die Domain implizit ist. |
| [get_DomainKey](./get_domainkey/)() const | Gibt den Domain‑Schlüssel zurück. |
| [get_Expired](./get_expired/)() | Liest einen Wert, der angibt, ob das Cookie abgelaufen ist. |
| [get_Expires](./get_expires/)() | Liest den Wert des Attributs 'Expires'. |
| [get_HttpOnly](./get_httponly/)() const | Liest den Wert des Attributs 'HttpOnly'. |
| [get_Name](./get_name/)() const | Liest den Namen des Cookies. |
| [get_Path](./get_path/)() const | Liest den Wert des Attributs 'Path'. |
| [get_Plain](./get_plain/)() const | Gibt einen Wert zurück, der angibt, ob die Cookie‑Spezifikation 'Plain' ist. |
| [get_Port](./get_port/)() const | Liest den Wert des Attributs 'Port'. |
| [get_PortList](./get_portlist/)() const | Gibt die Sammlung der Werte des Attributs 'Port' zurück. |
| [get_Secure](./get_secure/)() const | Liest den Wert des Attributs 'Secure'. |
| [get_TimeStamp](./get_timestamp/)() const | Gibt den Zeitpunkt zurück, zu dem das Cookie erstellt wurde. |
| [get_Value](./get_value/)() const | Liest den cookie's'value. |
| [get_Variant](./get_variant/)() const | Liest die Spezifikation des Cookies. |
| [get_Version](./get_version/)() const | Liest den Wert des '[Version](../../system/version/)' Attributs. |
| [GetHashCode](./gethashcode/)() const override | Analog zur C#-Methode [Object.GetHashCode()](../../system/object/gethashcode/). Ermöglicht das Hashen benutzerdefinierter Objekte. |
| [InternalSetName](./internalsetname/)(String) | Diese Methode wird von anderen Methoden aufgerufen, um einen Methodennamen festzulegen. |
| [set_Comment](./set_comment/)(String) | Setzt den Wert des 'Comment'-Attributs. |
| [set_CommentUri](./set_commenturi/)(System::SharedPtr\<Uri\>) | Setzt den Wert des 'CommentURL'-Attributs. |
| [set_Discard](./set_discard/)(bool) | Setzt den Wert des 'Discard'-Attributs. |
| [set_Domain](./set_domain/)(String) | Setzt den Wert des 'Domain'-Attributs. |
| [set_DomainImplicit](./set_domainimplicit/)(bool) | Setzt einen Wert, der angibt, ob die Domain implizit ist. |
| [set_Expired](./set_expired/)(bool) | Setzt einen Wert, der angibt, ob das Cookie abgelaufen ist. |
| [set_Expires](./set_expires/)(DateTime) | Setzt den Wert des 'Expires'-Attributs. |
| [set_HttpOnly](./set_httponly/)(bool) | Setzt den Wert des 'HttpOnly'-Attributs. |
| [set_Name](./set_name/)(String) | Setzt den Namen des Cookies. |
| [set_Path](./set_path/)(String) | Setzt den Wert des 'Path'-Attributs. |
| [set_Port](./set_port/)(String) | Setzt den Wert des 'Port'-Attributs. |
| [set_Secure](./set_secure/)(bool) | Setzt den Wert des 'Secure'-Attributs. |
| [set_Value](./set_value/)(String) | Setzt den Wert des Cookies. |
| [set_Variant](./set_variant/)(CookieVariant) | Setzt die Spezifikation des Cookies. |
| [set_Version](./set_version/)(int32_t) | Setzt den Wert des '[Version](../../system/version/)' Attributs. |
| [ToServerString](./toserverstring/)() | Serialisiert die aktuelle Instanz in die String-Darstellung. |
| [ToString](./tostring/)() const override | Analog zur C#-Methode [Object.ToString()](../../system/object/tostring/). Ermöglicht die Konvertierung benutzerdefinierter Objekte in einen String. |
| [VerifySetDefaults](./verifysetdefaults/)(CookieVariant, System::SharedPtr\<Uri\>, bool, String, bool, bool) | Überprüft und setzt die Standardwerte der Attribute. |
## Felder

| Feld | Beschreibung |
| --- | --- |
| static [CommentAttributeName](./commentattributename/) | Der Name des 'Comment'-Attributs. |
| static [CommentUrlAttributeName](./commenturlattributename/) | Der Name des 'CommentURL'-Attributs. |
| static [DiscardAttributeName](./discardattributename/) | Der Name des 'Discard'-Attributs. |
| static [DomainAttributeName](./domainattributename/) | Der Name des 'Domain'-Attributs. |
| static [EqualsLiteral](./equalsliteral/) | Das Trennzeichen, das verwendet wird, um den Namen und den Wert eines Attributs zu trennen. |
| static [ExpiresAttributeName](./expiresattributename/) | Der Name des Attributs 'Expires'. |
| static [HttpOnlyAttributeName](./httponlyattributename/) | Der Name des Attributs 'HttpOnly'. |
| static [MaxAgeAttributeName](./maxageattributename/) | Der Name des Attributs 'Max-Age'. |
| static [MaxSupportedVersion](./maxsupportedversion/) | RTTI-Informationen. |
| static [MaxSupportedVersionString](./maxsupportedversionstring/) | Die Zeichenkettenrepräsentation der maximal unterstützten Version. |
| static [PathAttributeName](./pathattributename/) | Der Name des Attributs 'Path'. |
| static [PortAttributeName](./portattributename/) | Der Name des Attributs 'Port'. |
| static [PortSplitDelimiters](./portsplitdelimiters/) | Das Array, das Trennzeichen für die Werte des Attributs 'Port' enthält. |
| static [QuotesLiteral](./quotesliteral/) | Das Symbol, das verwendet wird, um die Teile des Attributs zu umschließen. |
| static [ReservedToName](./reservedtoname/) | Ein Wert, der für den Cookie-Namen reserviert ist. |
| static [ReservedToValue](./reservedtovalue/) | Ein Wert, der für den Cookie-Wert reserviert ist. |
| static [SecureAttributeName](./secureattributename/) | Der Name des Attributs 'Secure'. |
| static [SeparatorLiteral](./separatorliteral/) | Der Attributseparator. |
| static [SpecialAttributeLiteral](./specialattributeliteral/) | Das Präfix der Namen spezieller Attribute. |
| static [VersionAttributeName](./versionattributename/) | Der Name des Attributs '[Version](../../system/version/)'. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
