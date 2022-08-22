---
title: FileFormat
second_title: Aspose.3D لمرجع .NET API
description: تعريف تنسيق الملف
type: docs
weight: 1000
url: /ar/net/aspose.threed/fileformat/
---
## FileFormat class

تعريف تنسيق الملف

```csharp
public class FileFormat
```

## الخصائص

| اسم | وصف |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport) { get; } | التعرف على ما إذا كان Aspose.3D يدعم مشهد التصدير إلى تنسيق الملف الحالي. |
| [CanImport](../../aspose.threed/fileformat/canimport) { get; } | الحصول على ما إذا كان Aspose.3D يدعم مشهد الاستيراد من تنسيق الملف الحالي. |
| [ContentType](../../aspose.threed/fileformat/contenttype) { get; } | الحصول على نوع محتوى تنسيق الملف |
| [Extension](../../aspose.threed/fileformat/extension) { get; } | الحصول على اسم الامتداد من هذا النوع. |
| [Extensions](../../aspose.threed/fileformat/extensions) { get; } | الحصول على أسماء الامتدادات من هذا النوع. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype) { get; } | يحصل على نوع تنسيق الملف |
| [Version](../../aspose.threed/fileformat/version) { get; } | يحصل على إصدار تنسيق الملف |

## طُرق

| اسم | وصف |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect#detect_1)(string) | اكتشف تنسيق الملف من اسم الملف ، يجب أن يكون الملف قابلاً للقراءة حتى يتمكن Aspose.3D من اكتشاف تنسيق الملف من خلال رأس الملف. |
| static [Detect](../../aspose.threed/fileformat/detect#detect)(Stream, string) | اكتشف تنسيق الملف من دفق البيانات ، اسم الملف اختياري لتخمين الأنواع التي لا تحتوي على رأس سحري. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension)(string) | الحصول على تنسيق الملف المفضل من امتداد الملف name يجب أن يبدأ اسم الامتداد بنقطة (".") . |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions)() | إنشاء خيارات تحميل افتراضية لتنسيق الملف هذا |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions)() | إنشاء خيارات حفظ افتراضية لتنسيق الملف هذا |
| override [ToString](../../aspose.threed/fileformat/tostring)() | تنسيقات السلسلة |

## مجالات

| اسم | وصف |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf) | تنسيق ملف التصنيع الإضافي |
| static readonly [ASE](../../aspose.threed/fileformat/ase) | تنسيق ASCII Scene Exporter لـ 3D Studio Max . |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb) | Aspose.3D Web format. |
| static readonly [Collada](../../aspose.threed/fileformat/collada) | تنسيق ملف Collada |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds) | تنسيق ملف 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf) | أوتوكاد DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii) | تنسيق ملف ASCII FBX ، مع إصدار 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary) | تنسيق ملف Binary FBX ، مع إصدار 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii) | تنسيق ملف ASCII FBX ، مع إصدار 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary) | تنسيق ملف Binary FBX ، مع إصدار 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii) | تنسيق ملف ASCII FBX ، مع إصدار 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary) | تنسيق ملف Binary FBX ، مع إصدار 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii) | تنسيق ملف ASCII FBX ، مع إصدار 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary) | تنسيق ملف FBX ثنائي ، مع إصدار 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii) | تنسيق ملف ASCII FBX ، مع إصدار 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary) | تنسيق ملف Binary FBX ، مع إصدار 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii) | تنسيق ملف ASCII FBX ، مع إصدار 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary) | تنسيق ملف Binary FBX ، مع إصدار 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii) | تنسيق ملف ASCII FBX ، إصدار 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary) | تنسيق ملف ثنائي FBX ، إصدار 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf) | مجموعة خرونوس glTF |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2) | إصدار glTF 2.0 لمجموعة Khronos |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary) | إصدار glTF 2.0 لمجموعة Khronos |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary) | glTF لمجموعة Khronos في تنسيق ثنائي |
| static readonly [HTML5](../../aspose.threed/fileformat/html5) | ملف HTML5 |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf) | Microsoft 3D Manufacturing Format |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd) | ملف بيانات PCL Point Cloud Data في وضع ASCII |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary) | ملف بيانات PCL Point Cloud Data في الوضع الثنائي |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8) | إصدار ملف JT من Siemens 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9) | إصدار ملف JT من Siemens 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii) | تنسيق ملف ASCII STL |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary) | تنسيق ملف ثنائي STL |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d) | تنسيق ملف Universal3D |
| static readonly [USD](../../aspose.threed/fileformat/usd) | وصف المشهد العالمي |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz) | وصف المشهد العام المضغوط |
| static readonly [VRML](../../aspose.threed/fileformat/vrml) | لغة نمذجة الواقع الافتراضي |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj) | تنسيق ملف Obj لـ Wavefront |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary) | ملف DirectX X بتنسيق ثنائي |
| static readonly [XText](../../aspose.threed/fileformat/xtext) | ملف DirectX X بتنسيق ثنائي |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz) | ملف سحابة نقطة Xyz |
| static readonly [Zip](../../aspose.threed/fileformat/zip) | أرشيف مضغوط يحتوي على تنسيق ملف ثلاثي الأبعاد آخر. |
| static readonly [Draco](../../aspose.threed/fileformat/draco) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf) | تنسيق المستندات المحمولة من Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply) | تنسيق ملف المضلع أو تنسيق مثلث ستانفورد |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary) | نموذج نظام إدارة تصميم المصنع AVEVA بتنسيق ثنائي |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext) | نموذج نظام إدارة تصميم المصنع AVEVA بتنسيق نصي |

### أنظر أيضا

* مساحة الاسم [Aspose.ThreeD](../../aspose.threed)
* المجسم [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
