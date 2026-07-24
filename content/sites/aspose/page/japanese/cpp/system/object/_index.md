---
title: "System::Object クラス"
linktitle: "Object"
second_title: "C++ 用 Aspose.Page"
description: "System::Object クラス。C# の System.Object クラスで利用可能なメソッドを使用できるようにする基底クラスです。翻訳環境で使用されるすべての非自明クラスは C++ でこれを継承すべきです。"
type: docs
weight: 4800
url: /ja/cpp/system/object/
---
## Object class


C# の [System.Object](./) クラスで利用可能なメソッドを使用できるようにする基底クラスです。翻訳環境で使用されるすべての非自明クラスはこれを継承すべきです。

```cpp
class Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Equals](./equals/)(ptr) | C# の [Object.Equals](./equals/) セマンティクスを使用してオブジェクトを比較します。 |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | C# スタイルで参照型オブジェクトを比較します。 |
| static [Equals](./equals/)(T1 const\&, T2 const\&) | C# スタイルで値型オブジェクトを比較します。 |
| static [Equals](./equals/)(float const\&, float const\&) | IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。 |
| static [Equals](./equals/)(double const\&, double const\&) | IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。 |
| virtual [FastCast](./fastcast/)(const Details::FastRttiBase\&, void **) const | 内部用途専用です。 |
| [GetCounter](./getcounter/)() | オブジェクトに関連付けられた参照カウンタのデータ構造を取得します。 |
| virtual [GetHashCode](./gethashcode/)() const | C# の [Object.GetHashCode()](./gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| virtual [GetType](./gettype/)() const | オブジェクトの実際の型を取得します。C# の [System.Object.GetType()](./gettype/) 呼び出しの類似です。 |
| virtual [Is](./is/)(const TypeInfo\&) const | オブジェクトが targetType で記述された型のインスタンスであるかを確認します。C# の 'is' 演算子の類似です。 |
| [Lock](./lock/)() | C# の lock() 文のロック機構を実装します。直接呼び出すか、[LockContext](../lockcontext/) センティリーオブジェクトを使用してください。 |
| virtual [MemberwiseClone](./memberwiseclone/)() const | C# の [Object.MemberwiseClone()](./memberwiseclone/) メソッドの類似です。カスタム型のクローン作成を可能にします。 |
| [Object](./object/)() | オブジェクトを作成します。すべての内部データ構造を初期化します。 |
| [Object](./object/)(Object const\&) | コピーコンストラクタ。実際には何もコピーせず、新しいオブジェクトを初期化し、サブクラスのコピー構築を可能にします。 |
| [operator=](./operator=/)(Object const\&) | 代入演算子。実際には何もコピーせず、新しいオブジェクトを初期化し、サブクラスのコピー構築を可能にします。 |
| static [ReferenceEquals](./referenceequals/)(ptr const\&, ptr const\&) | 参照によってオブジェクトを比較します。 |
| static [ReferenceEquals](./referenceequals/)(T const\&, T const\&) | 参照によってオブジェクトを比較します。 |
| static [ReferenceEquals](./referenceequals/)(T const\&, std::nullptr_t) | Reference-は値型オブジェクトを nullptr と比較します。 |
| [ReferenceEquals](./referenceequals/)(String const\&, std::nullptr_t) | 文字列と nullptr の場合の [Object::ReferenceEquals](./referenceequals/) の特殊化。 |
| [ReferenceEquals](./referenceequals/)(String const\&, String const\&) | 文字列の場合の [Object::ReferenceEquals](./referenceequals/) の特殊化。 |
| [RemovedSharedRefs](./removedsharedrefs/)(int) | 共有参照カウントを指定された値だけ減少させます。 |
| virtual [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
| [SharedCount](./sharedcount/)() const | 共有参照カウンタの現在の値を取得します。 |
| [SharedRefAdded](./sharedrefadded/)() | 共有参照カウントをインクリメントします。直接呼び出すべきではなく、代わりにスマートポインタまたは ThisProtector を使用してください。 |
| [SharedRefRemovedSafe](./sharedrefremovedsafe/)() | 共有参照カウントをデクリメントし、返します。直接呼び出すべきではなく、代わりにスマートポインタまたは ThisProtector を使用してください。 |
| virtual [ToString](./tostring/)() const | C# の [Object.ToString()](./tostring/) メソッドの類似です。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [Type](./type/)() | C# の typeof([System.Object](./)) 構文を実装します。 |
| [Unlock](./unlock/)() | C# の lock() 文のロック解除を実装します。直接呼び出すか、[LockContext](../lockcontext/) ガードオブジェクトを使用してください。 |
| [WeakRefAdded](./weakrefadded/)() | 弱参照カウントをインクリメントします。直接呼び出すべきではなく、代わりにスマートポインタまたは ThisProtector を使用してください。 |
| [WeakRefRemoved](./weakrefremoved/)() | 弱参照カウントをデクリメントします。直接呼び出すべきではなく、代わりにスマートポインタまたは ThisProtector を使用してください。 |
| virtual [~Object](./~object/)() | オブジェクトを破棄します。すべての内部データ構造を解放します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ptr](./ptr/) | スマートポインタ型のエイリアスです。 |
## 備考


C# の [System.Object](./) クラスで利用可能なメソッドに加えて、翻訳コード環境固有のいくつかの概念のサポートも可能にします。これには、スマートポインタクラス（[System::SmartPtr](../smartptr/)、[System::WeakPtr](../weakptr/)、[System::DynamicWeakPtr](../dynamicweakptr/)）で使用される参照カウントや、メモリ管理、デバッグなどに関連するその他のサービスが含まれます。

各 [Object](./) には 2 つの参照カウンタがあります：共有参照カウンタと弱参照カウンタです。弱参照カウンタは常に分離されたデータ構造に格納され、[Object](./) 自体には格納されません。これにより、弱ポインタが参照対象オブジェクトよりも長く存続できるようになります。スマート参照カウンタは、ENABLE_EXTERNAL_REFCOUNT マクロの状態に応じて、オブジェクト自体または同じ分離構造に格納されます。デフォルトでは、デバッグビルドで有効になり、リリースビルドで無効になります。スマートポインタカウンタがオブジェクト自体に格納される場合、弱ポインタが存在する時だけ分離データ構造が作成されます。そうでない場合は、オブジェクト自体と共に作成されます。

すべてのスマートポインタはこれら 2 つの参照カウンタを使用し、同一かつ唯一の所有権グループに寄与します。

[Object](./) のサブクラスがスタック上で作成された場合、そのオブジェクトへのスマートポインタは作成できません。さもなければスタック削除の問題が発生します。

この型は、スタック上の値型として、または [System::MakeObject()](../makeobject/) 関数を使用してヒープ上に割り当てることができます。オブジェクトが割り当てられたら、これら 2 つの使用ケースを混同しないでください。スタック上に割り当てられたオブジェクトに対して [SmartPtr](../smartptr/) ポインタを保持することは厳格に禁止されています。
## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
