---
title: System::Drawing::Image::FromStream method
linktitle: FromStream
second_title: Aspose.Page for C++
description: 'System::Drawing::Image::FromStream method. Creates an Image object from the specified stream in C++.'
type: docs
weight: 2700
url: /cpp/system.drawing/image/fromstream/
---
## Image::FromStream method


Creates an [Image](../) object from the specified stream.

```cpp
static SharedPtr<Image> System::Drawing::Image::FromStream(const SharedPtr<System::IO::Stream> &stream, bool use_embedded_color_management=false, bool validate_image_data=true)
```


| Parameter | Type | Description |
| --- | --- | --- |
| stream | const SharedPtr\<System::IO::Stream\>\& | A stream that contains image data |
| use_embedded_color_management | bool | IGNORED |
| validate_image_data | bool | IGNORED |

### ReturnValue

A shared pointer to the created [Image](../) object.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Image](../)
* Class [Stream](../../../system.io/stream/)
* Class [Image](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
