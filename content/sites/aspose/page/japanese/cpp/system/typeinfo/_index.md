---
title: "System::TypeInfo クラス"
linktitle: "TypeInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::TypeInfo クラス。C++ で特定の型を表し、その情報を提供します。"
type: docs
weight: 6600
url: /ja/cpp/system/typeinfo/
---
## TypeInfo class


特定の型を表し、その情報を提供します。

```cpp
class TypeInfo
```

## Nested classes

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | 指定された属性を型の属性リストに追加します。 |
| [AddDefaultConstructor](./adddefaultconstructor/)() | 型 T のデフォルトコンストラクタを設定します。 |
| [AddDefaultConstructor](./adddefaultconstructor/)(DefaultConstructor) | クラスのインスタンスを作成するファンクタによってデフォルトコンストラクタを設定します。 |
| [AddMember](./addmember/)(const SharedPtr\<System::Reflection::MemberInfo\>\&) | 指定されたメンバーを型のメンバーリストに追加します。 |
| static [BoxedValueType](./boxedvaluetype/)() | 複数の Boxed* クラスで共有されるように、[BoxedValue](./boxedvalue/) 型用のユニークな [TypeInfo](./) 構造体を提供します。 |
| [Equals](./equals/)(const TypeInfo\&) const |  |
| [get_Assembly](./get_assembly/)() const | 未実装です。現在のオブジェクトが表す型が宣言されているアセンブリへのポインタを返します。 |
| [get_AssemblyQualifiedName](./get_assemblyqualifiedname/)() const | 未実装です。現在のオブジェクトが表す型のアセンブリ名を含む完全修飾名を返します。 |
| [get_BaseType](./get_basetype/)() const | 基底型の記述子を返します。 |
| [get_ContainsGenericParameters](./get_containsgenericparameters/)() const | 現在の Type オブジェクトが、特定の型に置き換えられていない型パラメータを持っているかどうかを示す値を取得します。 |
| [get_DeclaredMember](./get_declaredmember/)(const String\&) const | 指定された名前を持つメンバーのリストを取得します。 |
| [get_FullName](./get_fullname/)() const | 現在のオブジェクトが表す型の完全修飾名（ただしアセンブリ名は除く）を返します。 |
| [get_GenericTypeArguments](./get_generictypearguments/)() const | この型のジェネリック型引数の配列を取得します。 |
| [get_IsAbstract](./get_isabstract/)() const | 型が抽象的であり、オーバーライドが必要かどうかを示す値を取得します。 |
| [get_IsArray](./get_isarray/)() const | 型が配列かどうかを示す値を取得します。 |
| [get_IsClass](./get_isclass/)() const | 型がクラスまたはデリゲートかどうかを示す値を取得します。つまり、値型やインターフェイスではありません。 |
| [get_IsEnum](./get_isenum/)() const | 現在の型が列挙体を表すかどうかを示す値を取得します。 |
| [get_IsGenericType](./get_isgenerictype/)() const |  |
| [get_IsGenericTypeDefinition](./get_isgenerictypedefinition/)() const | 現在の型が他のジェネリック型を構築できるジェネリック型定義を表すかどうかを示す値を取得します。 |
| [get_IsInterface](./get_isinterface/)() const | 型がインターフェイスかどうかを示す値を取得します。つまり、クラスや値型ではありません。 |
| [get_IsSealed](./get_issealed/)() const | 型が sealed と宣言されているかどうかを示す値を取得します。 |
| [get_IsValueType](./get_isvaluetype/)() const | 型が値型かどうかを示す値を取得します。 |
| [get_IsVisible](./get_isvisible/)() const | 型がアセンブリ外部のコードからアクセス可能かどうかを示す値を取得します。 |
| [get_Name](./get_name/)() const | 現在のオブジェクトが表す型の名前を返します。 |
| [get_Namespace](./get_namespace/)() const | 型の名前空間を取得します。 |
| [GetConstructor](./getconstructor/)(const ArrayPtr\<TypeInfo\>\&) const | 指定された配列の型と一致するパラメーターを持つ public インスタンス コンストラクタを検索します。 |
| [GetConstructors](./getconstructors/)(System::Reflection::BindingFlags) const | 指定された BindingFlags を使用して、現在の型に定義されたコンストラクタを検索します。 |
| [GetConstructors](./getconstructors/)() const | 現在の型に定義されたすべての public コンストラクタを返します。 |
| [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&) const | 現在のオブジェクトが表す型に適用され、指定された型を持つカスタム属性を検索します。 |
| [GetCustomAttributes](./getcustomattributes/)() const | 型に適用されたすべてのカスタム属性を表すオブジェクトの配列を返します。 |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | 型に適用された特定の属性を表すオブジェクトの配列を返します。 |
| [GetElementType](./getelementtype/)() const | 未実装です。 |
| [GetField](./getfield/)(const System::String\&, System::Reflection::BindingFlags) const | 指定されたバインディング制約を使用して、指定されたフィールドを検索します。 |
| [GetFields](./getfields/)(System::Reflection::BindingFlags) const | 指定されたバインディング制約を使用して、現在の型に定義されたフィールドを検索します。 |
| [GetGenericArguments](./getgenericarguments/)() const | この型のジェネリック型引数の配列を取得します。 |
| [GetHashCode](./gethashcode/)() const | このインスタンスに関連付けられたハッシュコードを返します。 |
| [GetInterfaces](./getinterfaces/)() const | 現在の型が実装または継承しているすべてのインターフェイスを取得します。 |
| [GetMember](./getmember/)(const String\&) const | 指定された名前を持つメンバーのリストを取得します。 |
| [GetMethod](./getmethod/)(const String\&) const | 指定された名前のメソッドを取得します。 |
| [GetProperties](./getproperties/)() const | 現在の型のすべての public プロパティを返します。 |
| [GetProperties](./getproperties/)(System::Reflection::BindingFlags) const | 指定されたバインディング制約を使用して、現在の Type のプロパティを検索します。 |
| [GetTemplParamType](./gettemplparamtype/)() const | テンプレートパラメータ型の記述子を取得します。 |
| [Hash](./hash/)() const | 現在のオブジェクトが表す型に関連付けられたハッシュ値を返します。 |
| [IsAssignableFrom](./isassignablefrom/)(const TypeInfo\&) const | 指定された型のインスタンスを現在の型の変数に代入できるかどうかを判断します。 |
| [IsDefined](./isdefined/)(const TypeInfo\&, bool) const | 未実装です。指定された型またはその派生型の属性がこのメンバーに適用されているかどうかを示します。 |
| [IsInstanceOfType](./isinstanceoftype/)(const SharedPtr\<Object\>\&) const | 指定されたオブジェクトが現在の型のインスタンスかどうかを判断します。 |
| [IsSubclassOf](./issubclassof/)(const TypeInfo\&) const | 現在のオブジェクトが表す型が、指定されたクラスのサブクラスかどうかを判断します。 |
| [operator!=](./operator!=/)(const TypeInfo\&) const | 現在のオブジェクトと指定された [TypeInfo](./) オブジェクトが等しくないかどうかを判断します。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 現在の [TypeInfo](./) オブジェクトが null オブジェクトでないか、すなわち何らかの型を表しているかどうかを判断します。 |
| [operator==](./operator==/)(const TypeInfo\&) const | 現在のオブジェクトと指定された [TypeInfo](./) オブジェクトが等しいかどうかを判断します。 |
| [operator==](./operator==/)(std::nullptr_t) const | 現在の [TypeInfo](./) オブジェクトが null オブジェクトであるか、すなわち何も型を表さないかどうかを判断します。 |
| [reset](./reset/)() | [TypeInfo](./) を null に設定します。 |
| [set_IsValueType](./set_isvaluetype/)(bool) | Type が値型かどうかを示す値を設定します。 |
| [SetBaseType](./setbasetype/)(GetTypeInfoFunPtr) | 基底型の記述子を設定します。 |
| [SetTemplParamType](./settemplparamtype/)(const TypeInfo\&) | テンプレートパラメータ型の記述子を設定します。 |
| static [StringHash](./stringhash/)(const char_t *) | 指定された文字列のハッシュを計算します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す型の名前を含む文字列を返します。 |
| static [Type](./type/)() | [TypeInfo](./) クラスを表す [TypeInfo](./) オブジェクトを返します。 |
| [TypeInfo](./typeinfo/)() | デフォルトコンストラクタ（型が設定されていません）。 |
| [TypeInfo](./typeinfo/)(std::nullptr_t) | ヌルオブジェクトコンストラクタ（型が設定されていません）。 |
| [TypeInfo](./typeinfo/)(const char_t *) | コンストラクタ。 |
| [TypeInfo](./typeinfo/)(const char_t *, uint32_t) | コンストラクタ。 |
| [TypeInfo](./typeinfo/)(const std::type_info\&) | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [EmptyType](./emptytype/) | [TypeInfo](./) の空リストを表す定数です。 |
| static [EmptyTypes](./emptytypes/) | [TypeInfo](./) の空リストを表す定数です。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [DefaultConstructor](./defaultconstructor/) | 型を構築する関数ポインタです。 |
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
