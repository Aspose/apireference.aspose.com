---
title: "System::Collections::IListImplRefType-klass"
linktitle: "IListImplRefType"
second_title: "Aspose.Page för C++"
description: "System::Collections::IListImplRefType-klass. Stub som implementerar System::Collections::IList-gränssnittet på System::Collections::Generic::List-objekt. Implementering för referenstyper i C++."
type: docs
weight: 1100
url: /sv/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Stub som implementerar [System::Collections::IList](../ilist/) gränssnitt på [System::Collections::Generic::List](../../system.collections.generic/list/) objekt. Implementering för referenstyper.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Lägger till ett element i slutet av listan. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Konverterar typreferens till objektvärde till objekt. |
| [Clear](./clear/)() override | Raderar alla element. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Kontrollerar om objektet finns i listan. |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) metodimplementation Hämtar antalet element i samlingen. |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) implementation Returnerar en enumerator som itererar genom en samling. |
| [idx_get](./idx_get/)(int, int) const override | Hämtar elementet på det angivna indexet. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Skapar en ny objektinstans. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Hämtar index för första förekomsten av objektet i behållaren. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Infogar elementet på angiven position och flyttar andra element. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Tar bort den första förekomsten av ett specifikt objekt från listan. |
| [RemoveAt](./removeat/)(int) override | Tar bort objektet på angiven position. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Konverterar objektvärde till en specifik typreferens. |
## Se även

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
