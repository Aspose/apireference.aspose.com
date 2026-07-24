---
title: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope method"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page için C++"
description: "System::Xml::IXmlNamespaceResolver::GetNamespacesInScope yöntemi. Şu anda kapsamda olan tanımlı önek‑ad alanı eşlemelerinin bir koleksiyonunu C++'da döndürür."
type: docs
weight: 100
url: /tr/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


Şu anda kapsam içinde olan tanımlı önek-ad alanı eşlemelerinin bir koleksiyonunu döndürür.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| scope | XmlNamespaceScope | Dönen ad alanı düğümlerinin türünü belirten bir [XmlNamespaceScope](../../xmlnamespacescope/) değeri. |

### ReturnValue

Mevcut kapsam içindeki ad alanlarını içeren bir IDictionary koleksiyonu.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
