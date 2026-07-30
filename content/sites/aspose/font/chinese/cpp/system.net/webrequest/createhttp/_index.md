---
title: "System::Net::WebRequest::CreateHttp 方法"
linktitle: "CreateHttp"
second_title: "Aspose.Font 适用于 C++"
description: "System::Net::WebRequest::CreateHttp 方法。 在 C++ 中使用指定的 URI 创建 WebRequest 类的新实例。"
type: docs
weight: 300
url: /zh/cpp/system.net/webrequest/createhttp/
---
## WebRequest::CreateHttp(String) method


使用指定的 URI 创建一个新的 [WebRequest](../) 类实例。

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(String requestUriString)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| requestUriString | String | 用于创建 [WebRequest](../) 类新实例的 URI。 |

### ReturnValue

新创建的 WebRequest 类实例。
## 备注



当指定的 URI 以除 [http://](http://) 或 [https://](https://) 之外的任何方案开头时，将抛出 NotSupportedException。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [String](../../../system/string/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
## WebRequest::CreateHttp(System::SharedPtr\<Uri\>) method


使用指定的 URI 创建一个新的 [WebRequest](../) 类实例。

```cpp
static System::SharedPtr<HttpWebRequest> System::Net::WebRequest::CreateHttp(System::SharedPtr<Uri> requestUri)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| requestUri | System::SharedPtr\<Uri\> | 用于创建 [WebRequest](../) 类新实例的 URI。 |

### ReturnValue

新创建的 WebRequest 类实例。
## 备注



当指定的 URI 以除 [http://](http://) 或 [https://](https://) 之外的任何方案开头时，将抛出 NotSupportedException。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [HttpWebRequest](../../httpwebrequest/)
* Class [Uri](../../../system/uri/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Font for C++](../../../)
