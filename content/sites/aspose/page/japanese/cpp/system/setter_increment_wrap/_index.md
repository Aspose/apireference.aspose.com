---
title: "System::setter_increment_wrap メソッド"
linktitle: "setter_increment_wrap"
second_title: "C++ 用 Aspose.Page"
description: "System::setter_increment_wrap メソッド。翻訳者は、setter と getter が定義されたクラスのプロパティを対象とした C# のインクリメント式を、C++ でこの関数の呼び出しに変換します。"
type: docs
weight: 37400
url: /ja/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


翻訳者は、setter と getter が定義されたクラスのプロパティを対象とした C# のインクリメント式を、この関数の呼び出しに変換します。

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| パラメーター | 説明 |
| --- | --- |
| T | プロパティの型 |
| Host | - 修正対象インスタンスのクラス |
| HostGet | - プロパティの getter が定義されている Host 自体、またはその基底型 |
| HostSet | - プロパティの setter が定義されている Host 自体、またはその基底型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | Host *const | プロパティをインクリメントするオブジェクトへのポインタ |
| pGetter | T(HostGet::*)() | プロパティの getter メソッドを指す関数ポインタ |
| pSetter | void(HostSet::*)(T) | プロパティの setter メソッドを指す関数ポインタ |

### ReturnValue

プロパティのインクリメント後の値

## 参照

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


翻訳者は、setter と getter が定義されたクラスのプロパティを対象とした C# のインクリメント式を、この関数の呼び出しに変換します。

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| パラメーター | 説明 |
| --- | --- |
| T | プロパティの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| pGetter | T(*)() | プロパティのゲッターフリー関数を指す関数ポインタ |
| pSetter | void(*)(T) | プロパティのセッターフリー関数を指す関数ポインタ |

### ReturnValue

プロパティのインクリメント後の値

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
