---
title: "System::EventHandler typedef"
linktitle: "EventHandler"
second_title: "C++ 用 Aspose.Page"
description: "System::EventHandler typedef. イベントに反応し処理するメソッドを表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。C++ でこの型のオブジェクトを管理するために System::SmartPtr クラスを使用しないでください。"
type: docs
weight: 11400
url: /ja/cpp/system/eventhandler/
---
## EventHandler typedef


イベントに反応し処理するメソッドを表します。この型はスタック上に割り当て、値または参照で関数に渡すべきです。[System::SmartPtr](../smartptr/) クラスを使用してこの型のオブジェクトを管理しないでください。

```cpp
using System::EventHandler =  MulticastDelegate<void(System::SharedPtr<Object>, TEventArgs)>
```


## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
