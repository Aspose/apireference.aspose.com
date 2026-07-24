---
title: "System::Xml::XmlWriter::WriteDocType メソッド"
linktitle: "WriteDocType"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlWriter::WriteDocType メソッド。派生クラスでオーバーライドされた場合、指定された名前とオプションの属性を使用して DOCTYPE 宣言を書き出します（C++）。"
type: docs
weight: 1700
url: /ja/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


派生クラスでオーバーライドされた場合、指定された名前とオプションの属性を使用して DOCTYPE 宣言を書き出します。

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| name | const String\& | DOCTYPE の名前です。空であってはなりません。 |
| pubid | const String\& | null でない場合、PUBLIC \"pubid\" \"sysid\" も書き込みます。ここで **pubid** と **sysid** は与えられた引数の値に置き換えられます。 |
| sysid | const String\& | **pubid** が **nullptr** で **sysid** が null でない場合、SYSTEM \"sysid\" と書き込み、**sysid** はこの引数の値に置き換えられます。 |
| subset | const String\& | null でない場合、[subset] を書き込みます。ここで subset はこの引数の値に置き換えられます。 |

## 参照

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
