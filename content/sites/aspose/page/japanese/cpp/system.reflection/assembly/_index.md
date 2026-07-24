---
title: "System::Reflection::Assembly クラス"
linktitle: "Assembly"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::Assembly クラス。アセンブリを記述するリフレクションクラスです。C# と C++ では規則が大きく異なるため、サポートは限定的です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にはそのポインタを使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.reflection/assembly/
---
## Assembly class


[Reflection](../) class describing assembly. Support is limited as the rules are quite different between C# and C++. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Assembly : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Assembly](./assembly/)() | コンストラクタ。 |
| virtual [get_CodeBase](./get_codebase/)() const | 現在のアセンブリのディレクトリを取得します。サポートは限定的です。 |
| virtual [get_FullName](./get_fullname/)() const | アセンブリの完全名を取得します。 |
| virtual [get_Location](./get_location/)() const | アセンブリの場所を取得します。未実装です。 |
| static [GetAssembly](./getassembly/)(const TypeInfo\&) | 特定の型を定義しているアセンブリを取得します。 |
| static [GetCallingAssembly](./getcallingassembly/)() | 呼び出し元アセンブリを取得します。 |
| static [GetEntryAssembly](./getentryassembly/)() | エントリ アセンブリを取得します。 |
| static [GetExecutingAssembly](./getexecutingassembly/)() | 実行中のアセンブリを取得します。 |
| virtual [GetManifestResourceNames](./getmanifestresourcenames/)() const | マニフェスト リソースの名前を取得します。 |
| virtual [GetManifestResourceStream](./getmanifestresourcestream/)(String) const | マニフェスト リソースに接続されたストリームを取得します。 |
| virtual [GetName](./getname/)() const | アセンブリ名を取得します。 |
| virtual [GetTypes](./gettypes/)() const | アセンブリで宣言された型を取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
