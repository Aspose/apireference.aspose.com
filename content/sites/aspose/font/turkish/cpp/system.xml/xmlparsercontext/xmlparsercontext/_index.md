---
title: "System::Xml::XmlParserContext::XmlParserContext yapıcı"
linktitle: "XmlParserContext"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlParserContext::XmlParserContext yapıcı. XmlParserContext sınıfının belirtilen XmlNameTable, XmlNamespaceManager, temel URI, xml:lang, xml:space ve belge türü değerleriyle yeni bir örneğini C++'ta başlatır."
type: docs
weight: 100
url: /tr/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Belirtilen [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), temel URI, **xml:lang**, **xml:space** ve belge türü değerleriyle [XmlParserContext](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) dizgileri atomize etmek için kullanılacak. Eğer bu **nullptr** ise, **nsMgr** oluşturmak için kullanılan ad tablosu bunun yerine kullanılır. Atomize edilmiş dizgiler hakkında daha fazla bilgi için [XmlNameTable](../../xmlnametable/) adresine bakın. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Ad alanı bilgilerini aramak için kullanılacak [XmlNamespaceManager](../../xmlnamespacemanager/) veya **nullptr**. |
| docTypeName | const String\& | Belge türü bildiriminin adı. |
| pubId | const String\& | Genel tanımlayıcı. |
| sysId | const String\& | Sistem tanımlayıcısı. |
| internalSubset | const String\& | İç DTD alt kümesi. DTD alt kümesi varlık çözümlemesi için kullanılır, belge doğrulaması için değil. |
| baseURI | const String\& | XML parçacığı için temel URI (parçacığın yüklendiği konum). |
| xmlLang | const String\& | **xml:lang** kapsamı. |
| xmlSpace | System::Xml::XmlSpace | **xml:space** kapsamını gösteren bir [XmlSpace](../../xmlspace/) değeri. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Belirtilen [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), temel URI, **xml:lang**, **xml:space**, kodlama ve belge türü değerleriyle [XmlParserContext](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) dizgileri atomize etmek için kullanılacak. Eğer bu **nullptr** ise, **nsMgr** oluşturmak için kullanılan ad tablosu bunun yerine kullanılır. Atomize edilmiş dizgiler hakkında daha fazla bilgi için [XmlNameTable](../../xmlnametable/) adresine bakın. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Ad alanı bilgilerini aramak için kullanılacak [XmlNamespaceManager](../../xmlnamespacemanager/) veya **nullptr**. |
| docTypeName | const String\& | Belge türü bildiriminin adı. |
| pubId | const String\& | Genel tanımlayıcı. |
| sysId | const String\& | Sistem tanımlayıcısı. |
| internalSubset | const String\& | İç DTD alt kümesi. DTD varlık çözümlemesi için kullanılır, belge doğrulaması için değil. |
| baseURI | const String\& | XML parçacığı için temel URI (parçacığın yüklendiği konum). |
| xmlLang | const String\& | **xml:lang** kapsamı. |
| xmlSpace | System::Xml::XmlSpace | **xml:space** kapsamını gösteren bir [XmlSpace](../../xmlspace/) değeri. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Kodlama ayarını gösteren bir Encoding nesnesi. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


Belirtilen [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang** ve **xml:space** değerleriyle [XmlParserContext](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) dizgileri atomize etmek için kullanılacak. Eğer bu **nullptr** ise, **nsMgr** oluşturmak için kullanılan ad tablosu bunun yerine kullanılır. Atomize edilmiş dizgiler hakkında daha fazla bilgi için [XmlNameTable](../../xmlnametable/) adresine bakın. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Ad alanı bilgilerini aramak için kullanılacak [XmlNamespaceManager](../../xmlnamespacemanager/) veya **nullptr**. |
| xmlLang | const String\& | **xml:lang** kapsamı. |
| xmlSpace | System::Xml::XmlSpace | **xml:space** kapsamını gösteren bir [XmlSpace](../../xmlspace/) değeri. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Belirtilen [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space** ve kodlama ile [XmlParserContext](../) sınıfının yeni bir örneğini başlatır.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) dizgileri atomize etmek için kullanılacak. Eğer bu **nullptr** ise, **nsMgr** oluşturmak için kullanılan ad tablosu bunun yerine kullanılır. Atomize edilmiş dizgiler hakkında daha fazla bilgi için [XmlNameTable](../../xmlnametable/) adresine bakın. |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | Ad alanı bilgilerini aramak için kullanılacak [XmlNamespaceManager](../../xmlnamespacemanager/) veya **nullptr**. |
| xmlLang | const String\& | **xml:lang** kapsamı. |
| xmlSpace | System::Xml::XmlSpace | **xml:space** kapsamını gösteren bir [XmlSpace](../../xmlspace/) değeri. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Kodlama ayarını gösteren bir Encoding nesnesi. |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
