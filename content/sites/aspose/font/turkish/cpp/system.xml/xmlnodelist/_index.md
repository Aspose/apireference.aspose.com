---
title: "System::Xml::XmlNodeList sınıfı"
linktitle: "XmlNodeList"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNodeList sınıfı. C++'da sıralı bir düğüm koleksiyonunu temsil eder."
type: docs
weight: 2700
url: /tr/cpp/system.xml/xmlnodelist/
---
## XmlNodeList class


Sıralı bir düğüm koleksiyonunu temsil eder.

```cpp
class XmlNodeList : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XmlNode>>,
                    public System::IDisposable
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_Count](./get_count/)() | [XmlNodeList](./) içindeki düğüm sayısını döndürür. |
| virtual [GetEnumerator](./getenumerator/)() | [XmlNodeList](./) içindeki düğüm koleksiyonu üzerinde yineleme desteği sağlar. |
| virtual [idx_get](./idx_get/)(int32_t) | Verilen indeksteki bir düğümü döndürür. |
| virtual [Item](./item/)(int32_t) | Verilen indeksteki bir düğümü alır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Xml](../)
* Library [Aspose.Font for C++](../../)
