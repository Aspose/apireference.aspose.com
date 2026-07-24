---
title: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode メソッド"
linktitle: "GetHashCode"
second_title: "C++ 用 Aspose.Page"
description: "System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode メソッド。任意の型のハッシュコードを取得します。C++ でそれを行うために Object::GetHashCode() を呼び出します。"
type: docs
weight: 100
url: /ja/cpp/system.runtime.compilerservices/runtimehelpers/gethashcode/
---
## RuntimeHelpers::GetHashCode method


任意の型のハッシュコードを取得します。これを行うために [Object::GetHashCode()](../../../system/object/gethashcode/) を呼び出します。

```cpp
template<typename T> static int System::Runtime::CompilerServices::RuntimeHelpers::GetHashCode(SmartPtr<T> const &obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | ハッシュコードを取得する型。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | SmartPtr\<T\> const\& | 情報を取得するための [Object](../../../system/object/)です。 |

### ReturnValue

対象実装によって計算されたハッシュコード値。

## 参照

* Class [SmartPtr](../../../system/smartptr/)
* Class [RuntimeHelpers](../)
* Namespace [System::Runtime::CompilerServices](../../)
* Library [Aspose.Page for C++](../../../)
