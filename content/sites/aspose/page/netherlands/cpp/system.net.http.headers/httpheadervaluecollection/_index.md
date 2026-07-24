---
title: "System::Net::Http::Headers::HttpHeaderValueCollection klasse"
linktitle: "HttpHeaderValueCollection"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::HttpHeaderValueCollection klasse. Vertegenwoordigt de collectie van de headerwaarden. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 800
url: /nl/cpp/system.net.http.headers/httpheadervaluecollection/
---
## HttpHeaderValueCollection class


Vertegenwoordigt de collectie van de headerwaarden. Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
template<typename T>class HttpHeaderValueCollection : public System::Collections::Generic::ICollection<T>
```


| Parameter | Beschrijving |
| --- | --- |
| De | type van de headerwaarden die in de collectie worden weergegeven. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Add](./add/)(const T\&) override | Voegt een element toe aan de collectie. |
| [Clear](./clear/)() override | Verwijdert alle elementen uit de collectie. |
| [Contains](./contains/)(const T\&) const override | Controleert of een element aanwezig is in de collectie. |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int32_t) override | Kopieert alle collectie‑elementen naar bestaande array‑elementen. |
| [get_Count](./get_count/)() const override | RTTI-informatie. |
| [get_IsReadOnly](./get_isreadonly/)() | Haalt een waarde op die aangeeft of de huidige collectie alleen‑lezen is. |
| [get_IsSpecialValueSet](./get_isspecialvalueset/)() | Haalt een waarde op die aangeeft of de huidige collectie een "speciale waarde" bevat. |
| [GetEnumerator](./getenumerator/)() override | Haalt enumerator op. |
| [GetHeaderStringWithoutSpecial](./getheaderstringwithoutspecial/)() | Retourneert een tekenreeksrepresentatie van de huidige collectie zonder een "speciale waarde". |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>) | Construeert een nieuw exemplaar. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Construeert een nieuw exemplaar. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T) | Construeert een nieuw exemplaar. |
| [HttpHeaderValueCollection](./httpheadervaluecollection/)(String, System::SharedPtr\<HttpHeaders\>, T, Action\<System::SharedPtr\<HttpHeaderValueCollection\<T\>\>, T\>) | Construeert een nieuw exemplaar. |
| [ParseAdd](./parseadd/)(String) | Parseert een header‑tekenreeksrepresentatie en voegt deze toe aan de huidige collectie. |
| [Remove](./remove/)(const T\&) override | Verwijdert element uit de collectie. |
| [RemoveSpecialValue](./removespecialvalue/)() | Verwijdert een "speciale waarde". |
| [SetSpecialValue](./setspecialvalue/)() | Stelt een "speciale waarde" in. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Stel het n'th sjabloonargument in op een zwakke pointer (in plaats van gedeeld). Hiermee kun je pointers in containers overschakelen naar zwakke modus. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| [TryParseAdd](./tryparseadd/)(String) | Probeert een header‑tekenreeksrepresentatie te parseren en toe te voegen aan de huidige collectie. |

## Zie ook

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
