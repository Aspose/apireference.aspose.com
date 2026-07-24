---
title: "System::Reflection 名前空間"
linktitle: "System::Reflection"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Reflection 名前空間を使用する方法。"
type: docs
weight: 4900
url: /ja/cpp/system.reflection/
---



## クラス

| クラス | 説明 |
| --- | --- |
| [Assembly](./assembly/) | [Reflection](./) クラスはアセンブリを記述します。C# と C++ では規則が大きく異なるため、サポートは限定的です。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡してください。 |
| [AssemblyName](./assemblyname/) | アセンブリ名を定義します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [AssemblyTypeRegistration](./assemblytyperegistration/) | 実行中のアセンブリに型を登録するシングルトン。 |
| [AssemblyTypeRegistrationBase](./assemblytyperegistrationbase/) | 実行中のアセンブリに型を登録するシングルトンの基底型。 |
| [ConstructorInfo](./constructorinfo/) | コンストラクタのメタデータへのアクセスを提供します。 |
| [FieldInfo](./fieldinfo/) | フィールドの属性を検出し、フィールドのメタデータへのアクセスを提供します。 |
| [MemberInfo](./memberinfo/) | メンバーに関するリフレクション情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [MethodBase](./methodbase/) | メソッドに関する基礎情報。このクラスのオブジェクトは [System::MakeObject()](../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。 |
| [MethodInfo](./methodinfo/) | クラスメソッドに関する情報を表します。 |
| [PropertyInfo](./propertyinfo/) | プロパティ情報を表します。 |
## Enums

| 列挙型 | 説明 |
| --- | --- |
| [BindingFlags](./bindingflags/) | メンバーと型の検索モードおよびバインディングを定義します。 |
| [FieldAttributes](./fieldattributes/) | リフレクトされたフィールド属性。 |
| [MemberTypes](./membertypes/) | 各メンバータイプにマークを付けます。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ReflectionTypeLoadException](./reflectiontypeloadexception/) | [ReflectionTypeLoadException](./reflectiontypeloadexception/) は、Module.GetTypes メソッドがモジュール内のクラスのいずれかのロードに失敗した場合にスローされます。[ReflectionTypeLoadException](./reflectiontypeloadexception/) クラスのインスタンスを [System::SmartPtr](../system/smartptr/) にラップしないでください。 |
| [TargetInvocationException](./targetinvocationexception/) | [TargetInvocationException](./targetinvocationexception/) は、リフレクションを通じて呼び出されたメソッドでスローされます。[TargetInvocationException](./targetinvocationexception/) クラスのインスタンスを [System::SmartPtr](../system/smartptr/) にラップしないでください。 |
