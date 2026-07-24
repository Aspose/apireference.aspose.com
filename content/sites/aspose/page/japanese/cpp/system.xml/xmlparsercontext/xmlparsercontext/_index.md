---
title: "System::Xml::XmlParserContext::XmlParserContext コンストラクタ"
linktitle: "XmlParserContext"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlParserContext::XmlParserContext コンストラクタ。C++ で、指定された XmlNameTable、XmlNamespaceManager、ベース URI、xml:lang、xml:space、およびドキュメントタイプの値を使用して XmlParserContext クラスの新しいインスタンスを初期化します。"
type: docs
weight: 100
url: /ja/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


指定された [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、ベース URI、**xml:lang**、**xml:space**、およびドキュメントタイプの値を使用して、[XmlParserContext](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 文字列をアトミック化するために使用する [XmlNameTable](../../xmlnametable/)。これが **nullptr** の場合、**nsMgr** の構築に使用された名前テーブルが代わりに使用されます。アトミック化された文字列の詳細については、[XmlNameTable](../../xmlnametable/) を参照してください。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 名前空間情報の検索に使用する [XmlNamespaceManager](../../xmlnamespacemanager/)、または **nullptr**。 |
| docTypeName | const String\& | 文書型宣言の名前。 |
| pubId | const String\& | 公開識別子。 |
| sysId | const String\& | システム識別子。 |
| internalSubset | const String\& | 内部 DTD サブセットです。DTD サブセットはエンティティ解決に使用され、文書の検証には使用されません。 |
| baseURI | const String\& | XML フラグメントのベース URI（フラグメントが読み込まれた場所）。 |
| xmlLang | const String\& | **xml:lang** のスコープです。 |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) の値で、**xml:space** スコープを示します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


指定された [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、ベース URI、**xml:lang**、**xml:space**、エンコーディング、および文書型の値を使用して、[XmlParserContext](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 文字列をアトミック化するために使用する [XmlNameTable](../../xmlnametable/)。これが **nullptr** の場合、**nsMgr** の構築に使用された名前テーブルが代わりに使用されます。アトミック化された文字列の詳細については、[XmlNameTable](../../xmlnametable/) を参照してください。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 名前空間情報の検索に使用する [XmlNamespaceManager](../../xmlnamespacemanager/)、または **nullptr**。 |
| docTypeName | const String\& | 文書型宣言の名前。 |
| pubId | const String\& | 公開識別子。 |
| sysId | const String\& | システム識別子。 |
| internalSubset | const String\& | 内部 DTD サブセットです。DTD はエンティティ解決に使用され、文書の検証には使用されません。 |
| baseURI | const String\& | XML フラグメントのベース URI（フラグメントが読み込まれた場所）。 |
| xmlLang | const String\& | **xml:lang** のスコープです。 |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) の値で、**xml:space** スコープを示します。 |
| enc | const SharedPtr\<System::Text::Encoding\>\& | エンコーディング設定を示す Encoding オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


指定された [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、**xml:lang**、**xml:space** の値を使用して、[XmlParserContext](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 文字列をアトミック化するために使用する [XmlNameTable](../../xmlnametable/)。これが **nullptr** の場合、**nsMgr** の構築に使用された名前テーブルが代わりに使用されます。アトミック化された文字列の詳細については、[XmlNameTable](../../xmlnametable/) を参照してください。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 名前空間情報の検索に使用する [XmlNamespaceManager](../../xmlnamespacemanager/)、または **nullptr**。 |
| xmlLang | const String\& | **xml:lang** のスコープです。 |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) の値で、**xml:space** スコープを示します。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


指定された [XmlNameTable](../../xmlnametable/)、[XmlNamespaceManager](../../xmlnamespacemanager/)、**xml:lang**、**xml:space**、およびエンコーディングを使用して、[XmlParserContext](../) クラスの新しいインスタンスを初期化します。

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | 文字列をアトム化するために使用する [XmlNameTable](../../xmlnametable/) です。これが **nullptr** の場合、**nsMgr** の構築に使用された名前テーブルが代わりに使用されます。アトム化された文字列の詳細については、[XmlNameTable](../../xmlnametable/) を参照してください。 |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | 名前空間情報の検索に使用する [XmlNamespaceManager](../../xmlnamespacemanager/)、または **nullptr**。 |
| xmlLang | const String\& | **xml:lang** のスコープです。 |
| xmlSpace | System::Xml::XmlSpace | [XmlSpace](../../xmlspace/) の値で、**xml:space** スコープを示します。 |
| enc | const SharedPtr\<System::Text::Encoding\>\& | エンコーディング設定を示す Encoding オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
