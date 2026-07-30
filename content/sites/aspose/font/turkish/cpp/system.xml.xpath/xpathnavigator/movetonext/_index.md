---
title: "System::Xml::XPath::XPathNavigator::MoveToNext metodu"
linktitle: "MoveToNext"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::MoveToNext metodu. Türetilmiş bir sınıfta geçersiz kılındığında, C++'ta XPathNavigator'ı geçerli düğümün bir sonraki kardeş düğümüne taşır."
type: docs
weight: 6000
url: /tr/cpp/system.xml.xpath/xpathnavigator/movetonext/
---
## XPathNavigator::MoveToNext() method


Türetilmiş bir sınıfta geçersiz kılındığında, [XPathNavigator](../) öğesini geçerli düğümün bir sonraki kardeş düğümüne taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext()=0
```


### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Ayrıca Bakınız

* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(String, String) method


[XPathNavigator](../) öğesini belirtilen yerel ad ve ad alanı URI'sine sahip bir sonraki kardeş düğüme taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Taşınacak bir sonraki kardeş düğümün yerel adı. |
| namespaceURI | Dize | Taşınacak bir sonraki kardeş düğümün ad alanı URI'si. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; **false** if there are no more siblings, or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
## XPathNavigator::MoveToNext(XPathNodeType) method


[XPathNavigator](../) öğesini, belirtilen [XPathNodeType](../../xpathnodetype/) ile eşleşen geçerli düğümün bir sonraki kardeş düğümüne taşır.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToNext(XPathNodeType type)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| type | XPathNodeType | Taşınacak kardeş düğümün [XPathNodeType](../../xpathnodetype/) değeri. |

### ReturnValue

**true** if the [XPathNavigator](../) is successful moving to the next sibling node; otherwise, **false** if there are no more siblings or if the [XPathNavigator](../) is currently positioned on an attribute node. If **false**, the position of the [XPathNavigator](../) is unchanged.

## Ayrıca Bakınız

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
