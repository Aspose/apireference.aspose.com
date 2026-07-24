---
title: "System::Xml::XmlConvert::IsXmlSurrogatePair メソッド"
linktitle: "IsXmlSurrogatePair"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlConvert::IsXmlSurrogatePair メソッド。渡されたサロゲート文字ペアが C++ で有効な XML 文字かどうかを確認します。"
type: docs
weight: 1000
url: /ja/cpp/system.xml/xmlconvert/isxmlsurrogatepair/
---
## XmlConvert::IsXmlSurrogatePair method


渡されたサロゲートペア文字が有効な XML 文字かどうかをチェックします。

```cpp
static bool System::Xml::XmlConvert::IsXmlSurrogatePair(char16_t lowChar, char16_t highChar)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| lowChar | char16_t | 検証対象のサロゲート文字。 |
| highChar | char16_t | 検証対象のサロゲート文字。 |

### ReturnValue

**true** if the passed in surrogate pair of characters is a valid XML character; otherwise, **false**.

## 参照

* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
