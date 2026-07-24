---
title: "System::Collections::Specialized::NameValueCollection klasse"
linktitle: "NameValueCollection"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Specialized::NameValueCollection klasse. Collectie van geassocieerde String-sleutels en String-waarden die in C++ benaderd kunnen worden via de sleutel of via de index."
type: docs
weight: 200
url: /nl/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Collectie van geassocieerde [String](../../system/string/) sleutels en [String](../../system/string/) waarden die benaderd kunnen worden via de sleutel of via de index.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const String\&) override | Overschrijf [ICollection](../../system.collections/icollection/) methode - niet geïmplementeerd. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Kopieert de items in de opgegeven [NameValueCollection](./) naar de huidige. |
| virtual [Add](./add/)(const String\&, const String\&) | Voegt een item toe met de opgegeven naam en waarde. |
| [Clear](./clear/)() override | Verwijdert alle elementen. |
| [Contains](./contains/)(const String\&) const override | Controleert of een item aanwezig is in de collectie. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Kopieert collectie‑elementen naar bestaande array‑elementen. |
| virtual [Get](./get/)(const String\&) | Haalt de waarden op die geassocieerd zijn met de opgegeven sleutel. |
| virtual [get_AllKeys](./get_allkeys/)() | Haalt alle sleutels op. |
| [get_Count](./get_count/)() const override | Haalt het aantal sleutel/waarde-paren op. |
| virtual [get_Keys](./get_keys/)() | Haalt alle sleutels op. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op om door de collectie te itereren. |
| virtual [GetValues](./getvalues/)(const String\&) | Haalt de waarden op die geassocieerd zijn met de opgegeven sleutel. |
| [HasKeys](./haskeys/)() | Haalt een waarde op die aangeeft of de [NameValueCollection](./) sleutels bevat die niet null zijn. |
| [idx_get](./idx_get/)(const String\&) | Haalt de waarde op op de opgegeven index. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Stelt de waarde van een invoer in. |
| [NameValueCollection](./namevaluecollection/)() | Initialiseert een nieuw exemplaar van de [NameValueCollection](./) klasse die leeg is. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Kopieert de invoeren van de opgegeven [NameValueCollection](./) naar een nieuwe [NameValueCollection](./). |
| [Remove](./remove/)(const String\&) override | Verwijdert specifiek item. |
| virtual [Set](./set/)(const String\&, const String\&) | Stelt de waarde van een invoer in. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt de implementatie van begin const iterator voor de huidige container op. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt de implementatie van begin iterator voor de huidige container op. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt de implementatie van end const iterator voor de huidige container op. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt de implementatie van end iterator voor de huidige container op. |
## Zie ook

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
