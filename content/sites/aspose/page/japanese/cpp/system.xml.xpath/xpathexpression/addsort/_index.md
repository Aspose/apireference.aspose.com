---
title: "System::Xml::XPath::XPathExpression::AddSort メソッド"
linktitle: "AddSort"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XPath::XPathExpression::AddSort メソッド。派生クラスでオーバーライドされた場合、C++ において指定された IComparer オブジェクトに従って XPath 式で選択されたノードをソートします。"
type: docs
weight: 100
url: /ja/cpp/system.xml.xpath/xpathexpression/addsort/
---
## XPathExpression::AddSort(SharedPtr\<Object\>, SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\>) method


派生クラスでオーバーライドされた場合、指定された IComparer オブジェクトに従って [XPath](../../) 式で選択されたノードをソートします。

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, SharedPtr<Collections::Generic::IComparer<SharedPtr<Object>>> comparer)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | ソートキーを表すオブジェクトです。これはノードの **string** 値、またはコンパイルされた [XPath](../../) 式を持つ [XPathExpression](../) オブジェクトのいずれかです。 |
| 比較子 | SharedPtr\<Collections::Generic::IComparer\<SharedPtr\<Object\>\>\> | 2 つのオブジェクトの等価性を比較するために、特定のデータ型比較を提供する IComparer オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::AddSort(SharedPtr\<Object\>, XmlSortOrder, XmlCaseOrder, String, XmlDataType) method


派生クラスでオーバーライドされた場合、提供されたパラメータに従って [XPath](../../) 式で選択されたノードをソートします。

```cpp
virtual void System::Xml::XPath::XPathExpression::AddSort(SharedPtr<Object> expr, XmlSortOrder order, XmlCaseOrder caseOrder, String lang, XmlDataType dataType)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| expr | SharedPtr\<Object\> | ソートキーを表すオブジェクトです。これはノードの **string** 値、またはコンパイルされた [XPath](../../) 式を持つ [XPathExpression](../) オブジェクトのいずれかです。 |
| order | XmlSortOrder | ソート順を示す [XmlSortOrder](../../xmlsortorder/) の値です。 |
| caseOrder | XmlCaseOrder | 大文字と小文字の並び順を示す [XmlCaseOrder](../../xmlcaseorder/) の値です。 |
| lang | String | 比較に使用する言語です。言語タイプに対して [String::Compare](../../../system/string/compare/) メソッドに渡すことができる [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) クラスを使用します。例えば、米国英語の場合は "us-en" です。空文字列が指定された場合、システム環境から [Globalization::CultureInfo](../../../system.globalization/cultureinfo/) を決定します。 |
| dataType | XmlDataType | データ型のソート順を示す [XmlDataType](../../xmldatatype/) の値です。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [XmlSortOrder](../../xmlsortorder/)
* Enum [XmlCaseOrder](../../xmlcaseorder/)
* Class [String](../../../system/string/)
* Enum [XmlDataType](../../xmldatatype/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
