---
title: "Aspose::Page::EPS::XMP::XmpMetadata class"
linktitle: "XmpMetadata"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::EPS::XMP::XmpMetadata class. Biedt toegang tot de XMP-metadata‑stroom in C++."
type: docs
weight: 200
url: /nl/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Biedt toegang tot de [XMP](../) metadata‑stroom.

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Voegt een waarde toe aan metadata. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Voegt een waarde toe aan metadata. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Voegt een paar met sleutel en waarde toe aan de dictionary. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Voegt een waarde toe aan een array. De waarde wordt aan het einde van de array toegevoegd. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Voegt een waarde toe aan een array op een opgegeven index. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Voegt een benoemde waarde toe aan een structuur. |
| [Clear](./clear/)() override | Leegt metadata. |
| [Contains](./contains/)(const System::String\&) const | Controleert of een sleutel in metadata aanwezig is. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Controleert of het opgegeven sleutel‑waarde‑paar in de dictionary aanwezig is. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Bepaalt of dit woordenboek de opgegeven sleutel bevat. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Kopieert elementen van de collectie naar een array. |
| [get_Count](./get_count/)() const override | Haalt het aantal elementen in de collectie op. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Controleert of de collectie een vaste grootte heeft. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Controleert of de collectie alleen-lezen is. |
| [get_IsSynchronized](./get_issynchronized/)() | Controleert of de collectie gesynchroniseerd is. |
| [get_Keys](./get_keys/)() const override | Haalt de collectie met metadata‑sleutels op. |
| [get_NamespaceManager](./get_namespacemanager/)() | Haalt de namespace‑manager op. |
| [get_SyncRoot](./get_syncroot/)() const | Haalt het synchronisatie‑object van de collectie op. |
| [get_Values](./get_values/)() const override | Haalt de waarden in de metadata op. |
| [GetEnumerator](./getenumerator/)() override | Retourneert de woordenboek‑enumerator. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Retourneert de namespace‑URI op basis van het voorvoegsel. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Retourneert het voorvoegsel op basis van de namespace‑URI. |
| [idx_get](./idx_get/)(const System::String\&) const override | Haalt gegevens uit de metadata op. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Stelt gegevens uit de metadata in. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Registreert de namespace‑URI. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Registreert de namespace‑URI. |
| [Remove](./remove/)(const System::String\&) override | Verwijdert een item uit de metadata. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Verwijdert het sleutel/waarde‑paar uit de collectie. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Stelt een waarde in een array in. De vorige waarde wordt vervangen door een nieuwe. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Stelt een benoemde waarde in een structuur in. Een bestaande benoemde waarde wordt, indien aanwezig, vervangen door een nieuwe. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Probeert de sleutel in het woordenboek te vinden en haalt de waarde op als deze gevonden wordt. |
## Zie ook

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
