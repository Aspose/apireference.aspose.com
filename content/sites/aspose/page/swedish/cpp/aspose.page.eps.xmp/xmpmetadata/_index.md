---
title: "Aspose::Page::EPS::XMP::XmpMetadata klass"
linktitle: "XmpMetadata"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata klass. Tillhandahåller åtkomst till XMP-metadataström i C++."
type: docs
weight: 200
url: /sv/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Tillhandahåller åtkomst till [XMP](../) metadataström.

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Lägger till värde i metadata. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Lägger till värde i metadata. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Lägger till ett par med nyckel och värde i ordboken. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Lägger till ett värde i en array. Värdet kommer att läggas till i slutet av arrayen. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Lägger till ett värde i en array på angivet index. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Lägger till ett namngivet värde i en struktur. |
| [Clear](./clear/)() override | Rensar metadata. |
| [Contains](./contains/)(const System::String\&) const | Kontrollerar om nyckeln finns i metadata. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Kontrollerar om det angivna nyckel-värdeparet finns i ordboken. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Fastställer om denna ordbok innehåller den angivna nyckeln. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Kopierar element från samlingen till en array. |
| [get_Count](./get_count/)() const override | Hämtar antalet element i samlingen. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Kontrollerar om samlingen har fast storlek. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Kontrollerar om samlingen är skrivskyddad. |
| [get_IsSynchronized](./get_issynchronized/)() | Kontrollerar om samlingen är synkroniserad. |
| [get_Keys](./get_keys/)() const override | Hämtar samling av metadata-nycklar. |
| [get_NamespaceManager](./get_namespacemanager/)() | Hämtar namnrymdshanterare. |
| [get_SyncRoot](./get_syncroot/)() const | Hämtar samlingens synkroniseringsobjekt. |
| [get_Values](./get_values/)() const override | Hämtar värden i metadata. |
| [GetEnumerator](./getenumerator/)() override | Returnerar ordboksenumerator. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Returnerar namnrymdens URI efter prefix. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Returnerar prefix baserat på namespace URI. |
| [idx_get](./idx_get/)(const System::String\&) const override | Hämtar data från metadata. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Sätter data från metadata. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Registrerar namespace URI. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Registrerar namespace URI. |
| [Remove](./remove/)(const System::String\&) override | Tar bort post från metadata. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Tar bort nyckel/värde-par från samlingen. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Sätter värde i en array. Föregående värde kommer att ersättas med ett nytt. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Sätter namngivet värde i en struktur. Föregående namngivna värde, om det redan finns, kommer att ersättas med ett nytt. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Försöker hitta nyckel i ordboken och hämtar värdet om det hittas. |
## Se även

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
