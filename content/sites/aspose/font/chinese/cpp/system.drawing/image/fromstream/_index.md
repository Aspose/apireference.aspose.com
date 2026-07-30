---
title: "System::Drawing::Image::FromStream 方法"
linktitle: "FromStream"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Image::FromStream 方法。在 C++ 中创建一个 Image 对象，来自指定的流。"
type: docs
weight: 2900
url: /zh/cpp/system.drawing/image/fromstream/
---
## Image::FromStream method


从指定的流创建一个 [Image](../) 对象。

```cpp
static SharedPtr<Image> System::Drawing::Image::FromStream(const SharedPtr<System::IO::Stream> &stream, bool use_embedded_color_management=false, bool validate_image_data=true)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 流 | const SharedPtr\<System::IO::Stream\>\& | 包含图像数据的流 |
| use_embedded_color_management | bool | IGNORED |
| validate_image_data | bool | IGNORED |

### ReturnValue

指向已创建的 [Image](../) 对象的共享指针。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../)
* Class [Stream](../../../system.io/stream/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
