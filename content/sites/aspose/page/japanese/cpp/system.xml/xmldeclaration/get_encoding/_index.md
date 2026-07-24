---
title: "System::Xml::XmlDeclaration::get_Encoding メソッド"
linktitle: "get_Encoding"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlDeclaration::get_Encoding メソッド。C++ で XML ドキュメントのエンコーディングレベルを返します。"
type: docs
weight: 200
url: /ja/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


XML ドキュメントのエンコーディングレベルを返します。

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

有効な文字エンコーディング名です。
## 備考



XML で最も一般的にサポートされている文字エンコーディング名は次のとおりです: |||
|-|-|
| カテゴリ | エンコーディング名 |
| Unicode | UTF-8、UTF-16 |
| ISO 10646 | ISO-10646-UCS-2、ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n（"n" は 1 から 9 の数字） |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

この値はオプションです。値が設定されていない場合、このメソッドは[String::Empty](../../../system/string/empty/) を返します。エンコーディング属性が含まれていない場合、ドキュメントが書き込まれるまたは保存される際には UTF-8 エンコーディングが使用されるものとみなされます。
## 参照

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
