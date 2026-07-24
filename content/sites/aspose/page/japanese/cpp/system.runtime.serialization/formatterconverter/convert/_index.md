---
title: "System::Runtime::Serialization::FormatterConverter::Convert メソッド"
linktitle: "Convert"
second_title: "C++ 用 Aspose.Page"
description: "System::Runtime::Serialization::FormatterConverter::Convert メソッド。C++ の RTTI 情報です。"
type: docs
weight: 100
url: /ja/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI 情報。

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | 変換対象のオブジェクト。 |
| type | const TypeInfo\& | 変換先の [System::TypeInfo](../../../system/typeinfo/)。 |

### ReturnValue

変換後の値。
## 備考


指定された [System::TypeInfo](../../../system/typeinfo/) に値を変換します。
## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


指定された [System::TypeCode](../../../system/typecode/) に値を変換します。

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | 変換対象のオブジェクト。 |
| typeCode | TypeCode | 値が変換される対象の [System::TypeCode](../../../system/typecode/) |

### ReturnValue

変換後の値。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
