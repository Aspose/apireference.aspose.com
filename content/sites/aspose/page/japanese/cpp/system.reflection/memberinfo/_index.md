---
title: "System::Reflection::MemberInfo クラス"
linktitle: "MemberInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::MemberInfo クラス。メンバーに関するリフレクション情報を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.reflection/memberinfo/
---
## MemberInfo class


メンバーに関するリフレクション情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | コレクションに属性を追加します。 |
| [get_DeclaringType](./get_declaringtype/)() const | 宣言元の型を取得します。 |
| [get_FullName](./get_fullname/)() const | メンバーの完全名を取得します。手動で実装された部分では異なる場合があります。 |
| virtual [get_MemberType](./get_membertype/)() const | メンバーの種類（メソッド、コンストラクタ、イベントなど）を示す [System::Reflection::MemberTypes](../membertypes/) の値を取得します。 |
| [get_Name](./get_name/)() const | メンバー名を取得します。 |
| [get_ReflectedType](./get_reflectedtype/)() const | 反映された型を取得します。 |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | 現在のオブジェクトが表す型に適用されたすべてのカスタム属性を表すオブジェクトを含む配列を返します。 |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | 現在のオブジェクトが表す型に適用されたすべてのカスタム属性を表すオブジェクトを含む配列を返します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ObjectPtr](./objectptr/) | [Object](../../system/object/) への共有ポインタのエイリアスです。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
