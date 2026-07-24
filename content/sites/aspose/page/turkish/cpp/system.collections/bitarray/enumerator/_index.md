---
title: "System::Collections::BitArray::Enumerator sınıfı"
linktitle: "Enumerator"
second_title: "Aspose.Page için C++"
description: "System::Collections::BitArray::Enumerator sınıfı. C++'de yineleme amaçları için Enumerator tipi."
type: docs
weight: 2900
url: /tr/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | İteratör oluşturur. |
| [get_Current](./get_current/)() const override | Adreslenen biti boolean biçiminde alır. |
| [MoveNext](./movenext/)() override | Sonraki bite geçer. |
| [Reset](./reset/)() override | Sayacı ilk öğeden önceki konuma sıfırlar. |
## Ayrıca Bakınız

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Page for C++](../../../)
