---
title: "System::Xml::XmlTextReader::GetNamespacesInScope method"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlTextReader::GetNamespacesInScope method. C++'da şu anda kapsamda olan tüm ad alanlarını içeren bir koleksiyon döndürür."
type: docs
weight: 3400
url: /tr/cpp/system.xml/xmltextreader/getnamespacesinscope/
---
## XmlTextReader::GetNamespacesInScope method


Geçerli kapsamda bulunan tüm ad alanlarını içeren bir koleksiyon döndürür.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlTextReader::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| scope | XmlNamespaceScope | Dönen ad alanı düğümlerinin türünü belirten bir [XmlNamespaceScope](../../xmlnamespacescope/) değeri. |

### ReturnValue

Mevcut kapsamda olan tüm ad alanlarını içeren bir IDictionary nesnesi. Okuyucu bir eleman üzerinde konumlandırılmamışsa, boş bir sözlük (ad alanı yok) döndürülür.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
