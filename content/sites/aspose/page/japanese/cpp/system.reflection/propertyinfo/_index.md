---
title: "System::Reflection::PropertyInfo クラス"
linktitle: "PropertyInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::PropertyInfo クラス。C++ でプロパティ情報を表します。"
type: docs
weight: 1000
url: /ja/cpp/system.reflection/propertyinfo/
---
## PropertyInfo class


プロパティ情報を表します。

```cpp
class PropertyInfo : public System::Reflection::MemberInfo
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | このメンバーがプロパティであることを示す [MemberTypes](../membertypes/) の値を取得します。 |
| [get_PropertyType](./get_propertytype/)() | プロパティの型を取得します。 |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>) | 特定のオブジェクトからプロパティの値を取得します。 |
| [GetValue](./getvalue/)(System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 特定のオブジェクトからプロパティの値を取得します。 |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)() const) | コンストラクタ。const getter のみを持つプロパティ。 |
| [PropertyInfo](./propertyinfo/)(String, System::SharedPtr\<PropertyType\>(ClassType::*)()) | コンストラクタ。非 const getter のみを持つプロパティ。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)() const) | コンストラクタ。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)()) | コンストラクタ。[Nullable](../../system/nullable/) プロパティ（setter と getter あり）。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Nullable\<NullableType\>), System::Nullable\<NullableType\>(ClassType::*)() const) | コンストラクタ。[Nullable](../../system/nullable/) プロパティ（const getter のみ）。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::SharedPtr\<PropertyType\>), System::SharedPtr\<PropertyType\>(ClassType::*)()) | コンストラクタ。[Object](../../system/object/) プロパティ（getter のみ）。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)()) | 文字列プロパティ情報を構築します。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::String), System::String(ClassType::*)() const) | const getter を持つクラスから文字列プロパティ情報を構築します。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)()) | [Decimal](../../system/decimal/) プロパティ情報を構築します。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(System::Decimal), System::Decimal(ClassType::*)() const) | const getter を持つクラスから [Decimal](../../system/decimal/) プロパティ情報を構築します。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)()) | ブール型プロパティ情報を構築します。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(bool), bool(ClassType::*)() const) | const getter を持つクラスからブール型プロパティ情報を構築します。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)()) | int64_t プロパティ情報を構築します。 |
| [PropertyInfo](./propertyinfo/)(String, void(ClassType::*)(int64_t), int64_t(ClassType::*)() const) | const getter を持つクラスから int64_t プロパティ情報を構築します。 |
| [set_PropertyType](./set_propertytype/)(const TypeInfo\&) | このプロパティの型を設定します。 |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>) | 特定のオブジェクトにプロパティの値を設定します。 |
| [SetValue](./setvalue/)(System::SharedPtr\<System::Object\>, System::SharedPtr\<System::Object\>, System::ArrayPtr\<System::SharedPtr\<System::Object\>\>) | 特定のオブジェクトにプロパティの値を設定します。 |
## 参照

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
