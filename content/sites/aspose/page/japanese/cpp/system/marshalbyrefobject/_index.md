---
title: "System::MarshalByRefObject クラス"
linktitle: "MarshalByRefObject"
second_title: "C++ 用 Aspose.Page"
description: "System::MarshalByRefObject クラス。リモーティング対応アプリケーションにおいて、アプリケーションドメイン境界を越えてオブジェクトへアクセスできるようにします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 4400
url: /ja/cpp/system/marshalbyrefobject/
---
## MarshalByRefObject class


リモーティング対応アプリケーションにおいて、アプリケーションドメイン境界を越えてオブジェクトへアクセスできるようにします。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class MarshalByRefObject : public virtual System::Object
```

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
