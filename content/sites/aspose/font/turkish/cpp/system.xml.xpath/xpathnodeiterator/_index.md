---
title: "System::Xml::XPath::XPathNodeIterator class"
linktitle: "XPathNodeIterator"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNodeIterator class. C++'da seçilmiş bir düğüm kümesi üzerinde yineleyici sağlar."
type: docs
weight: 600
url: /tr/cpp/system.xml.xpath/xpathnodeiterator/
---
## XPathNodeIterator class


Seçili düğüm kümesi üzerinde bir yineleyici sağlar.

```cpp
class XPathNodeIterator : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::XPath::XPathNavigator>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Clone](./clone/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu [XPathNodeIterator](./) nesnesinin bir kopyasını döndürür. |
| virtual [get_Count](./get_count/)() | Seçilen düğüm kümesindeki son düğümün indeksini döndürür. |
| virtual [get_Current](./get_current/)() | Türetilmiş bir sınıfta geçersiz kılındığında, bu [XPathNodeIterator](./) için, geçerli bağlam düğümünde konumlandırılmış [XPathNavigator](../xpathnavigator/) nesnesini alır. |
| virtual [get_CurrentPosition](./get_currentposition/)() | Türetilmiş bir sınıfta geçersiz kılındığında, seçilen düğüm kümesindeki geçerli konumun indeksini alır. |
| [GetEnumerator](./getenumerator/)() override | Seçilen düğüm kümesi üzerinde yineleme yapmak için bir IEnumerator nesnesi döndürür. |
| virtual [MoveNext](./movenext/)() | Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](../xpathnavigator/) nesnesini [XPathNodeIterator::get_Current](./get_current/) yöntemi tarafından döndürülen seçili düğüm kümesindeki bir sonraki düğüme taşır. |
| [XPathNodeIterator](./xpathnodeiterator/)() | Yeni bir [XPathNodeIterator](./) sınıfı örneği başlatır. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | Bu sınıfın bir örneğine ortak gösterici için bir takma ad. |
## Ayrıca Bakınız

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
