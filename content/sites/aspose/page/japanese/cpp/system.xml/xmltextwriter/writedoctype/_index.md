---
title: "System::Xml::XmlTextWriter::WriteDocType メソッド"
linktitle: "WriteDocType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlTextWriter::WriteDocType メソッド。C++ で指定された名前とオプションの属性を使用して DOCTYPE 宣言を書き出します。"
type: docs
weight: 2500
url: /ja/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


指定された名前とオプションの属性を使用して DOCTYPE 宣言を書き出します。

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | DOCTYPE の名前です。空であってはなりません。 |
| pubid | const String\& | null でない場合、PUBLIC \"pubid\" \"sysid\" も書き込みます。ここで **pubid** と **sysid** は与えられた引数の値に置き換えられます。 |
| sysid | const String\& | **pubid** が null で **sysid** が null でない場合、SYSTEM \"sysid\" を書き込みます。ここで **sysid** はこの引数の値に置き換えられます。 |
| subset | const String\& | null でない場合、[subset] を書き込みます。ここで subset はこの引数の値に置き換えられます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
