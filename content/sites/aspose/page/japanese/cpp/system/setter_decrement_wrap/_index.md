---
title: "System::setter_decrement_wrap メソッド"
linktitle: "setter_decrement_wrap"
second_title: "C++ 用 Aspose.Page"
description: "System::setter_decrement_wrap メソッド。トランスレータは、setter と getter が定義されたインスタンスのプロパティを対象とした C# の前置デクリメント式を、C++ におけるこの関数（const getter 用オーバーロード）の呼び出しに変換します。"
type: docs
weight: 37100
url: /ja/cpp/system/setter_decrement_wrap/
---
## System::setter_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


トランスレータは、setter と getter が定義されたインスタンスのプロパティを対象とした C# の前置デクリメント式を、（const getter 用オーバーロード）この関数の呼び出しに変換します。

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| パラメーター | 説明 |
| --- | --- |
| T | プロパティの型です。 |
| Host | - 修正対象インスタンスのクラス |
| HostConstGet | - プロパティの getter が定義されている Host 自体、またはその基底型 |
| HostSet | - プロパティの setter が定義されている Host 自体、またはその基底型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | Host *const | getter と setter を呼び出すインスタンスです。 |
| pGetter | T(HostConstGet::*)() const | プロパティの getter 関数を指す関数ポインタ |
| pSetter | void(HostSet::*)(T) | プロパティのセッター関数を指す関数ポインタ |

### ReturnValue

インクリメント前のプロパティの値

## 参照

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


トランスレータは、setter と getter が定義されたインスタンスのプロパティを対象とした C# の前置デクリメント式を、（non-const getter 用オーバーロード）この関数の呼び出しに変換します。

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| パラメーター | 説明 |
| --- | --- |
| T | プロパティの型です。 |
| Host | - 修正対象インスタンスのクラス |
| HostGet | - プロパティの getter が定義されている Host 自体、またはその基底型 |
| HostSet | - プロパティの setter が定義されている Host 自体、またはその基底型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| host | Host *const | getter と setter を呼び出すインスタンスです。 |
| pGetter | T(HostGet::*)() | プロパティの getter 関数を指す関数ポインタ |
| pSetter | void(HostSet::*)(T) | プロパティのセッター関数を指す関数ポインタ |

### ReturnValue

インクリメント前のプロパティの値

## 参照

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(T(*)(), void(*)(T)) method


トランスレータは、setter と getter が定義されたクラスのプロパティを対象とした C# の前置デクリメント式を、この関数の呼び出しに変換します。

```cpp
template<typename T> T System::setter_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| パラメーター | 説明 |
| --- | --- |
| T | プロパティの型 |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| pGetter | T(*)() | プロパティのゲッターフリー関数を指す関数ポインタ |
| pSetter | void(*)(T) | プロパティのセッターフリー関数を指す関数ポインタ |

### ReturnValue

インクリメント前のプロパティの値

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
