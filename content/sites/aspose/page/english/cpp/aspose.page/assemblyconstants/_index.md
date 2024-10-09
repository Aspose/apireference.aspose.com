---
title: Aspose::Page::AssemblyConstants class
linktitle: AssemblyConstants
second_title: Aspose.Page for C++
description: 'Aspose::Page::AssemblyConstants class. Defines the constants that participate in the license check for the component. These used to be defined directly as assembly attributes, but I moved them into separate class because in .NET Compact Framework I cannot access assembly attributes. Now the licensing code when compiled for the .NET Compact Framework uses these constants instead of the assembly attributes in C++.'
type: docs
weight: 100
url: /cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


Defines the constants that participate in the license check for the component. These used to be defined directly as assembly attributes, but I moved them into separate class because in .NET Compact Framework I cannot access assembly attributes. Now the licensing code when compiled for the .NET Compact Framework uses these constants instead of the assembly attributes.

```cpp
class AssemblyConstants : public System::Object
```

## Fields

| Field | Description |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | The producer of the output documents. |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | This is used by **Aspose** licensing code to verify the license is for the correct product. |
| static [Product2](./product2/) | This is used by **Aspose** licensing code to verify the license is for the correct product. Temporarily **Aspose.EPS** license will be valid for [Aspose.Page](../) too. |
| static [Product3](./product3/) | This is used by **Aspose** licensing code to verify the license is for the correct product. Temporarily Aspose.XPS license will be valid for [Aspose.Page](../) too. |
| static [ReleaseDate](./releasedate/) | This is used by **Aspose** licensing code to check for subscription expiry. You need to set this to the date you publish a release or a hotfix. |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | The version of the assembly. |
## See Also

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
