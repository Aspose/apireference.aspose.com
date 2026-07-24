---
title: "System::CastEnumerableTo メソッド"
linktitle: "CastEnumerableTo"
second_title: "C++ 用 Aspose.Page"
description: "System::CastEnumerableTo メソッド。指定された enumerable オブジェクトの要素を別の型に明示的にキャストする処理を C++ で実行します。"
type: docs
weight: 15500
url: /ja/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


指定された enumerable オブジェクトの要素を別の型に明示的にキャストします。

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| へ | enumerable オブジェクトの要素を静的にキャストする型 |
| From | enumerable オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| enumerable | const From\& | キャストする要素を含むEnumerableオブジェクト |

### ReturnValue

型 **To** の要素で、**enumerable** の要素に相当する新しいコレクションへのポインタ

## 参照

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


指定された enumerable オブジェクトの要素を別の型に明示的にキャストします。

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| パラメーター | 説明 |
| --- | --- |
| へ | enumerable オブジェクトの要素を静的にキャストする型 |
| From | enumerable オブジェクトの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| enumerable | const From\& | get_Count メソッドが定義され、キャストする要素を含むEnumerableオブジェクトの継承者です |

### ReturnValue

型 **To** の要素で、**enumerable** の要素に相当する新しいコレクションへのポインタ

## 参照

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
