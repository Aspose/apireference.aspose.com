---
title: "Aspose::Page::EPS::XMP::XmpMetadata Klasse"
linktitle: "XmpMetadata"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata Klasse. Bietet Zugriff auf den XMP-Metadatenstrom in C++."
type: docs
weight: 200
url: /de/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Bietet Zugriff auf den [XMP](../) Metadatenstrom.

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Fügt einen Wert zu den Metadaten hinzu. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Fügt einen Wert zu den Metadaten hinzu. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Fügt ein Paar aus Schlüssel und Wert in das Wörterbuch ein. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Fügt einen Wert in ein Array ein. Der Wert wird am Ende des Arrays hinzugefügt. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Fügt einen Wert in ein Array an einem angegebenen Index ein. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Fügt einen benannten Wert in eine Struktur ein. |
| [Clear](./clear/)() override | Löscht die Metadaten. |
| [Contains](./contains/)(const System::String\&) const | Überprüft, ob ein Schlüssel in den Metadaten enthalten ist. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Überprüft, ob das angegebene Schlüssel-Wert-Paar im Wörterbuch enthalten ist. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Bestimmt, ob dieses Wörterbuch den angegebenen Schlüssel enthält. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Kopiert Elemente der Sammlung in ein Array. |
| [get_Count](./get_count/)() const override | Ermittelt die Anzahl der Elemente in der Sammlung. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Überprüft, ob die Sammlung eine feste Größe hat. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Überprüft, ob die Sammlung schreibgeschützt ist. |
| [get_IsSynchronized](./get_issynchronized/)() | Überprüft, ob die Sammlung synchronisiert ist. |
| [get_Keys](./get_keys/)() const override | Ermittelt die Sammlung von Metadaten-Schlüsseln. |
| [get_NamespaceManager](./get_namespacemanager/)() | Ermittelt den Namensraum-Manager. |
| [get_SyncRoot](./get_syncroot/)() const | Ermittelt das Synchronisationsobjekt der Sammlung. |
| [get_Values](./get_values/)() const override | Ermittelt die Werte in den Metadaten. |
| [GetEnumerator](./getenumerator/)() override | Gibt den Wörterbuch-Enumerator zurück. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Gibt den Namensraum-URI anhand des Präfixes zurück. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Gibt das Präfix nach Namespace-URI zurück. |
| [idx_get](./idx_get/)(const System::String\&) const override | Liest Daten aus Metadaten. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Setzt Daten aus Metadaten. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Registriert Namespace-URI. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Registriert Namespace-URI. |
| [Remove](./remove/)(const System::String\&) override | Entfernt Eintrag aus Metadaten. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Entfernt Schlüssel/Wert-Paar aus der Sammlung. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Setzt Wert in einem Array. Der vorherige Wert wird durch den neuen ersetzt. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Setzt benannten Wert in eine Struktur. Der vorherige benannte Wert, falls bereits vorhanden, wird durch den neuen ersetzt. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Versucht, Schlüssel im Wörterbuch zu finden und gibt den Wert zurück, falls gefunden. |
## Siehe auch

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
