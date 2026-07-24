---
title: "System::SmartPtr クラス"
linktitle: "SmartPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::SmartPtr クラス。ヒープ上に割り当てられる型をラップするポインタクラスです。Object を継承するクラスのメモリ管理に使用します。このポインタ型は侵入型ポインタのセマンティクスに従います。参照カウンタは Object 自体または Object インスタンスに tightly 結び付けられたカウンタ構造体に格納されます。いずれの場合も、すべての SmartPtr インスタンスは作成方法に関係なく単一所有グループを形成し、std::shared_ptr クラスの動作とは異なります。生ポインタを SmartPtr に変換しても、同じオブジェクトへの共有参照を保持する他の SmartPtr インスタンスが存在すれば安全です。SmartPtr クラスのインスタンスは、共有ポインタと弱ポインタの 2 つの状態のいずれかになります。オブジェクトを生存させるには、共有参照のカウントが正である必要があります。弱ポインタと共有ポインタの両方で、指されたオブジェクトへ（メソッド呼び出し、フィールドの読み書きなど）アクセスできますが、弱ポインタは共有ポインタの参照カウントには参加しません。Object は最後の「shared」 SmartPtr ポインタが破棄されると削除されます。したがって、オブジェクト構築や破棄時に他に共有 SmartPtr ポインタが存在しない場合にこの状況が起こらないようにしてください。C++ コードでは System::Object::ThisProtector センティリオブジェクト、C# コード（変換対象）では CppCTORSelfReference または CppSelfReference 属性を使用してこの問題を修正します。同様に、System::WeakPtr ポインタクラスや System::SmartPtrMode::Weak ポインタモード（C++ コード）または CppWeakPtr 属性（C# コード）を使用してループ参照を解消してください。2 つ以上のオブジェクトが「shared」ポインタで相互参照すると、決して削除されません。実行時にポインタタイプ（弱または共有）を切り替える必要がある場合は、System::SmartPtr<T>::set_Mode() メソッドまたは System::DynamicWeakPtr クラスを使用します。SmartPtr クラスは仮想メソッドを含みません。独自のメモリ管理戦略を作成する場合にのみ継承すべきです。この型は他のオブジェクトの削除を管理するポインタで、スタック上に割り当て、C++ では値渡しまたは const 参照で関数に渡すべきです。"
type: docs
weight: 5500
url: /ja/cpp/system/smartptr/
---
## SmartPtr class


ヒープ上に割り当てられる型をラップするポインタクラスです。[Object](../object/) を継承するクラスのメモリ管理に使用します。このポインタ型は侵入型ポインタのセマンティクスに従います。参照カウンタは [Object](../object/) 自体または [Object](../object/) インスタンスに tightly 結び付けられたカウンタ構造体に格納されます。いずれの場合も、すべての [SmartPtr](./) インスタンスは作成方法に関係なく単一所有グループを形成し、std::shared_ptr クラスの動作とは異なります。生ポインタを [SmartPtr](./) に変換しても、同じオブジェクトへの共有参照を保持する他の [SmartPtr](./) インスタンスが存在すれば安全です。[SmartPtr](./) クラスのインスタンスは、共有ポインタと弱ポインタの 2 つの状態のいずれかになります。オブジェクトを生存させるには、共有参照のカウントが正である必要があります。弱ポインタと共有ポインタの両方で、指されたオブジェクトへ（メソッド呼び出し、フィールドの読み書きなど）アクセスできますが、弱ポインタは共有ポインタの参照カウントには参加しません。[Object](../object/) は最後の 'shared' [SmartPtr](./) ポインタが破棄されると削除されます。したがって、オブジェクト構築や破棄時に他に共有 [SmartPtr](./) ポインタが存在しない場合にこの状況が起こらないようにしてください。C++ コードでは System::Object::ThisProtector センティリオブジェクト、C# コード（変換対象）では CppCTORSelfReference または CppSelfReference 属性を使用してこの問題を修正します。同様に、[System::WeakPtr](../weakptr/) ポインタクラスや [System::SmartPtrMode::Weak](../smartptrmode/) ポインタモード（C++ コード）または CppWeakPtr 属性（C# コード）を使用してループ参照を解消してください。2 つ以上のオブジェクトが 'shared' ポインタで相互参照すると、決して削除されません。実行時にポインタタイプ（弱または共有）を切り替える必要がある場合は、[System::SmartPtr<T>::set_Mode()](./set_mode/) メソッドまたは [System::DynamicWeakPtr](../dynamicweakptr/) クラスを使用します。[SmartPtr](./) クラスは仮想メソッドを含みません。独自のメモリ管理戦略を作成する場合にのみ継承すべきです。この型は他のオブジェクトの削除を管理するポインタで、スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。

```cpp
template<class T>class SmartPtr
```


| パラメーター | 説明 |
| --- | --- |
| T | 指し示すオブジェクトの型。[System::Object](../object/) またはそのサブクラスである必要があります。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [begin](./begin/)() | 基底コレクションの [begin()](./begin/) メソッドへのアクセサ。[SmartPtr_](./smartptr_/) が [begin()](./begin/) メソッドを持つ特殊化型である場合にのみコンパイルされます。 |
| [begin](./begin/)() const | 基底コレクションの [begin()](./begin/) メソッドへのアクセサ。[SmartPtr_](./smartptr_/) が [begin()](./begin/) メソッドを持つ特殊化型である場合にのみコンパイルされます。 |
| [Cast](./cast/)() const | ポインタをその型自身にキャストします。 |
| [Cast](./cast/)() const | static_cast を使用してポインタを基底型にキャストします。 |
| [Cast](./cast/)() const | dynamic_cast を使用してポインタを派生型にキャストします。 |
| [Cast](./cast/)() const | dynamic_cast を使用してポインタを派生型にキャストします。 |
| [cbegin](./cbegin/)() const | 基底コレクションの [cbegin()](./cbegin/) メソッドへのアクセサ。[SmartPtr_](./smartptr_/) が [cbegin()](./cbegin/) メソッドを持つ特殊化型である場合にのみコンパイルされます。 |
| [cend](./cend/)() const | 基底コレクションの [cend()](./cend/) メソッドへのアクセサ。[SmartPtr_](./smartptr_/) が [cend()](./cend/) メソッドを持つ特殊化型である場合にのみコンパイルされます。 |
| [const_pointer_cast](./const_pointer_cast/)() const | 指し示すオブジェクトに対して const_cast を使用してポインタを別の型にキャストします。 |
| [dynamic_pointer_cast](./dynamic_pointer_cast/)() const | 指し示すオブジェクトに対して dynamic_cast を使用してポインタを別の型にキャストします。 |
| [end](./end/)() | 基底コレクションの [end()](./end/) メソッドへのアクセサ。[SmartPtr_](./smartptr_/) が [end()](./end/) メソッドを持つ特殊化型である場合にのみコンパイルされます。 |
| [end](./end/)() const | 基底コレクションの [end()](./end/) メソッドへのアクセサ。[SmartPtr_](./smartptr_/) が [end()](./end/) メソッドを持つ特殊化型である場合にのみコンパイルされます。 |
| [get](./get/)() const | 指し示すオブジェクトを取得します。 |
| [get_Mode](./get_mode/)() const | ポインタモードを取得します。 |
| [get_shared](./get_shared/)() const | 指し示されたオブジェクトを取得しますが、ポインタが共有モードであることをアサートします。 |
| [get_shared_count](./get_shared_count/)() const | 参照対象オブジェクトに存在する共有ポインタの数（現在のポインタを含む）を取得します。現在のポインタが共有モードであることをアサートします。 |
| [GetHashCode](./gethashcode/)() const | 指し示されたオブジェクトで [GetHashCode()](./gethashcode/) を呼び出します。 |
| [GetObjectNotNull](./getobjectnotnull/)() const | 現在参照されているオブジェクト（存在する場合）を取得するか、例外をスローします。 |
| [GetObjectOrNull](./getobjectornull/)() const | 指し示されたオブジェクト（存在する場合）または nullptr を取得します。これは [get()](./get/) と同等です。 |
| [GetObjectOwner](./getobjectowner/)() const | 参照されているオブジェクトを取得します。 |
| [GetPointer](./getpointer/)() const | 指し示されたオブジェクト（存在する場合）または nullptr を取得します。これは [get()](./get/) と同等です。 |
| [Is](./is/)(const System::TypeInfo\&) const | 指し示されたオブジェクトが特定の型またはその子型かどうかをチェックします。C# の 'is' セマンティクスに従います。 |
| [IsAliasingPtr](./isaliasingptr/)() const | ポインタが所有しているオブジェクト以外（エイリアシングコンストラクタで作成された）に指し示されているかどうかをチェックします。 |
| [IsShared](./isshared/)() const | ポインタが共有モードかどうかをチェックします。 |
| [IsWeak](./isweak/)() const | ポインタが弱参照モードかどうかをチェックします。 |
| explicit [operator bool](./operatorbool/)() const | ポインタが null でないかどうかをチェックします。 |
| [operator!](./operator!/)() const | ポインタが null かどうかをチェックします。 |
| [operator*](./operator_/)() const | 指し示されたオブジェクトへの参照を取得します。ポインタが null でないことをアサートします。 |
| [operator->](./operator-_/)() const | 参照されたオブジェクトのメンバーにアクセスできるようにします。 |
| [operator<](./operator_/)(Y *) const | [SmartPtr](./) クラスに対して less 比較のセマンティクスを提供します。 |
| [operator<](./operator_/)(SmartPtr\<Y\> const\&) const | [SmartPtr](./) クラスに対して less 比較のセマンティクスを提供します。 |
| [operator=](./operator=/)(SmartPtr_\&&) | [SmartPtr](./) オブジェクトにムーブ代入します。x は使用不能になります。 |
| [operator=](./operator=/)(const SmartPtr_\&) | [SmartPtr](./) オブジェクトにコピー代入します。 |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | [SmartPtr](./) オブジェクトにコピー代入します。必要な型変換を行います。 |
| [operator=](./operator=/)(Pointee_ *) | 生ポインタを [SmartPtr](./) オブジェクトに代入します。 |
| [operator=](./operator=/)(std::nullptr_t) | ポインタの値を nullptr に設定します。 |
| [operator==](./operator==/)(std::nullptr_t) const | ポインタが nullptr を指しているかどうかをチェックします。 |
| [operator[]](./operator[]/)(IdxType) const | 配列要素へのアクセサです。[SmartPtr_](./smartptr_/) が [System::Array](../array/) の特殊化である場合にのみコンパイルされます。 |
| [RemoveAliasing](./removealiasing/)() const | ポインタからエイリアシング（エイリアシングコンストラクタで作成された）を除去し、指し示すオブジェクトが同じであることを保証します（共有の場合は管理し、弱参照の場合は追跡します）。 |
| [reset](./reset/)(Pointee_ *) | 指し示されたオブジェクトを設定します。 |
| [reset](./reset/)() | ポインタが nullptr を指すようにします。 |
| [set_Mode](./set_mode/)(SmartPtrMode) | ポインタモードを設定します。参照されているオブジェクトの参照カウントが変更される可能性があります。 |
| [SetContainedTemplateWeakPtr](./setcontainedtemplateweakptr/)(uint32_t) const | 指されているオブジェクト（存在する場合）で SetTemplateWeakPtr() メソッドを呼び出します。 |
| [SmartPtr](./smartptr/)(SmartPtrMode) | 必要なモードの [SmartPtr](./) オブジェクトを作成します。 |
| [SmartPtr](./smartptr/)(std::nullptr_t, SmartPtrMode) | 必要なモードの null ポインタ [SmartPtr](./) オブジェクトを作成します。 |
| [SmartPtr](./smartptr/)(Pointee_ *, SmartPtrMode) | 指定されたオブジェクトを指す [SmartPtr](./) を作成するか、生ポインタを [SmartPtr](./) に変換します。 |
| [SmartPtr](./smartptr/)(const SmartPtr_\&, SmartPtrMode) | [SmartPtr](./) オブジェクトをコピー構築します。その後、両方のポインタは同じオブジェクトを指します。 |
| [SmartPtr](./smartptr/)(const SmartPtr\<Q\>\&, SmartPtrMode) | [SmartPtr](./) オブジェクトをコピー構築します。その後、両方のポインタは同じオブジェクトを指します。許可されている場合は型変換を実行します。 |
| [SmartPtr](./smartptr/)(SmartPtr_\&&, SmartPtrMode) | [SmartPtr](./) オブジェクトをムーブ構築します。実質的に、両方が同じモードであれば二つのポインタを入れ替えます。呼び出し後、x は使用できなくなる可能性があります。 |
| explicit [SmartPtr](./smartptr/)(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) | 参照された配列の型を、異なる型の新しい配列を作成して変換します。C# で配列の型キャストが可能だが C++ ではサポートされていない場合に便利です。 |
| explicit [SmartPtr](./smartptr/)(const Y\&) | 空の配列を初期化します。いくつかの C# コード構文を変換するために使用されます。 |
| [SmartPtr](./smartptr/)(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) | ptr の初期値と所有権情報を共有するが、無関係で管理されていないポインタ p を保持する [SmartPtr](./) を構築します。 |
| [static_pointer_cast](./static_pointer_cast/)() const | 指されているオブジェクトに対して static_cast を使用してポインタを別の型にキャストします。 |
| [ToObjectPtr](./toobjectptr/)() const | 任意のポインタ型を [Object](../object/) へのポインタに変換します。[Pointee_](./pointee_/) 型が完全である必要はありません。 |
| static [Type](./type/)() | [Pointee_](./pointee_/) 型の [System::TypeInfo](../typeinfo/) オブジェクトを取得するショートカットです。 |
| [~SmartPtr](./~smartptr/)() | [SmartPtr](./) オブジェクトを破棄します。必要に応じて、指されているオブジェクトの参照カウンタを減らし、オブジェクトを削除します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ArrayType](./arraytype/) | [Pointee_](./pointee_/) が [System::Array](../array/) の特殊化である場合はそれと同じで、そうでなければ void です。 |
| [Pointee_](./pointee_/) | 指し示す型。 |
| [SmartPtr_](./smartptr_/) | 特殊化されたスマートポインタ型です。 |
| [ValueType](./valuetype/) | 指された配列の格納型です。T が [System::Array](../array/) の特殊化である場合にのみ意味があります。 |

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
