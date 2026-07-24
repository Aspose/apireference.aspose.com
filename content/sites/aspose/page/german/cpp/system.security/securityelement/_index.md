---
title: "System::Security::SecurityElement Klasse"
linktitle: "SecurityElement"
second_title: "Aspose.Page für C++"
description: "System::Security::SecurityElement Klasse. XML-Objektmodell zum Kodieren von Sicherheitsobjekten. Nicht implementiert. Objekte dieser Klasse sollten ausschließlich mit der Funktion System::MakeObject() zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen System::SmartPtr‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen in C++ zu übergeben."
type: docs
weight: 300
url: /de/cpp/system.security/securityelement/
---
## SecurityElement class


XML-Objektmodell zum Kodieren von Sicherheitsobjekten. Nicht implementiert. Objekte dieser Klasse sollten ausschließlich über die Funktion [System::MakeObject()](../../system/makeobject/) zugewiesen werden. Erstellen Sie niemals eine Instanz dieses Typs auf dem Stack oder mit dem Operator new, da dies zu Laufzeitfehlern und/oder Assertionsfehlern führt. Wickeln Sie diese Klasse stets in einen [System::SmartPtr](../../system/smartptr/)‑Zeiger ein und verwenden Sie diesen Zeiger, um ihn als Argument an Funktionen zu übergeben.

```cpp
class SecurityElement : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [AddAttribute](./addattribute/)(const String\&, const String\&) | Fügt dem Tag ein Attribut hinzu. |
| [AddChild](./addchild/)(SecurityElement) | Fügt ein untergeordnetes Tag hinzu. |
| [Attribute](./attribute/)(const String\&) | Ermittelt den Attributwert. |
| [Copy](./copy/)() | Klont das Tag. |
| [Equal](./equal/)(SecurityElement) | Prüft die Gleichheit von Parametern. |
| static [Escape](./escape/)(const String\&) | Escapet Zeichen in einer XML-Zeichenfolge. |
| static [FromString](./fromstring/)(const String\&) | Erstellt ein Element aus XML-Code. |
| [get_Attributes](./get_attributes/)() | Ermittelt die Tag-Attribute. |
| [get_Children](./get_children/)() | Ermittelt die Kindobjekte des Tags. |
| [get_Tag](./get_tag/)() | Ermittelt den Tag-Namen. |
| [get_Text](./get_text/)() | Ermittelt den inneren Text des Tags. |
| static [IsValidAttributeName](./isvalidattributename/)(const String\&) | Prüft, ob der Attributname gültig ist. |
| static [IsValidAttributeValue](./isvalidattributevalue/)(const String\&) | Prüft, ob der Attributwert gültig ist. |
| static [IsValidTag](./isvalidtag/)(const String\&) | Prüft, ob das Tag gültig ist. |
| static [IsValidText](./isvalidtext/)(const String\&) | Überprüft, ob der Text gültig ist. |
| [SearchForChildByTag](./searchforchildbytag/)(const String\&) | Ermittelt das Kind-Tag nach Namen. |
| [SearchForTextOfTag](./searchfortextoftag/)(const String\&) | Ermittelt den inneren Text des Kind-Tags anhand des Tag-Namens. |
| [SecurityElement](./securityelement/)(const String\&) | Konstruktor. |
| [SecurityElement](./securityelement/)(const String\&, const String\&) | Konstruktor. |
| [set_Attributes](./set_attributes/)(System::Collections::Generic::Dictionary\<String, String\>) | Setzt Tag-Attribute. |
| [set_Children](./set_children/)(System::Collections::Generic::List\<SecurityElement\>) | Setzt Kind-Objekte des Tags. |
| [set_Tag](./set_tag/)(const String\&) | Setzt den Tag-Namen. |
| [set_Text](./set_text/)(const String\&) | Setzt den inneren Text des Tags. |
| [ToString](./tostring/)() const override | Konvertiert das Tag in einen String. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Security](../)
* Library [Aspose.Page for C++](../../)
