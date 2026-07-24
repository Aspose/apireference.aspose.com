---
title: "System::ObjectExt::UnknownIsNull メソッド"
linktitle: "UnknownIsNull"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt::UnknownIsNull メソッド。未知の型オブジェクトが nullptr かどうかをチェックします。C++ の非スカラー型向けのオーバーロードです。"
type: docs
weight: 1700
url: /ja/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


未知の型オブジェクトが nullptr かどうかをチェックします。非スカラー型向けのオーバーロード。

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Object](../../object/) 型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T | [Object](../../object/) をチェックします。 |

### ReturnValue

「obj == nullptr」が true の場合は true、そうでない場合は false です。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


未知の型オブジェクトが nullptr かどうかをチェックします。スカラー型向けのオーバーロード。

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| パラメーター | 説明 |
| --- | --- |
| T | [Object](../../object/) 型です。 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| obj | T | [Object](../../object/) をチェックします。 |

### ReturnValue

常に false を返します。

## 参照

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
