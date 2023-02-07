---
title: Scene
second_title: Aspose.3D untuk .NET API Referensi
description: Scene adalah objek tingkat atas yang berisi simpul geometri material tekstur animasi pose subadegan dll. Scene dapat memiliki subadegan berfungsi sebagai dukungan banyak dokumen dalam file seperti collada/blender /fbx Hirarki node dapat diakses melaluiRootNode./scene/rootnode/Library./scene/library/ digunakan untuk menyimpan referensi objek yang tidak terikat selama serialisasi seperti data meta atau objek khusus sehingga dapat digunakan sebagai perpustakaan.
type: docs
weight: 2250
url: /id/net/aspose.threed/scene/
---
## Scene class

Scene adalah objek tingkat atas yang berisi simpul, geometri, material, tekstur, animasi, pose, sub-adegan, dll. Scene dapat memiliki sub-adegan, berfungsi sebagai dukungan banyak dokumen dalam file seperti collada/blender /fbx Hirarki node dapat diakses melalui[`RootNode`](./rootnode/)[`Library`](./library/) digunakan untuk menyimpan referensi objek yang tidak terikat selama serialisasi (seperti data meta atau objek khusus) sehingga dapat digunakan sebagai perpustakaan.

```csharp
public class Scene : SceneObject
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Scene](scene/#constructor)() | Menginisialisasi instance baru dari`Scene` kelas. |
| [Scene](scene/#constructor_1)(Entity) | Menginisialisasi instance baru dari`Scene` kelas dengan entitas yang dilampirkan ke node baru. |
| [Scene](scene/#constructor_2)(Scene, string) | Menginisialisasi instance baru dari`Scene`kelas sebagai sub-adegan. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AnimationClips](../../aspose.threed/scene/animationclips/) { get; } | Mendapatkan semuanya[`AnimationClip`](../../aspose.threed.animation/animationclip/) didefinisikan dalam adegan. |
| [AssetInfo](../../aspose.threed/scene/assetinfo/) { get; set; } | Mendapat atau menyetel informasi aset tingkat teratas |
| [CurrentAnimationClip](../../aspose.threed/scene/currentanimationclip/) { get; set; } | Mendapat atau menyetel yang aktif[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [Library](../../aspose.threed/scene/library/) { get; } | Objek yang tidak langsung digunakan dalam hierarki adegan dapat ditentukan di Perpustakaan. Ini berguna saat Anda menggunakan sub-adegan dan meletakkan komponen yang dapat digunakan kembali di bawah sub-adegan. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [Poses](../../aspose.threed/scene/poses/) { get; } | Mendapatkan semuanya[`Pose`](../pose/) digunakan dalam adegan ini. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [RootNode](../../aspose.threed/scene/rootnode/) { get; } | Mendapat simpul akar dari TKP. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [SubScenes](../../aspose.threed/scene/subscenes/) { get; } | Mendapat semua sub-adegan |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile)(string) | Membuka adegan dari jalur yang diberikan |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_3)(string, CancellationToken) | Membuka adegan dari jalur yang diberikan |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_1)(string, FileFormat, CancellationToken) | Membuka adegan dari jalur yang diberikan menggunakan format file yang ditentukan. |
| static [FromFile](../../aspose.threed/scene/fromfile/#fromfile_2)(string, LoadOptions, CancellationToken) | Membuka adegan dari jalur yang diberikan menggunakan format file yang ditentukan. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_2)(Stream, CancellationToken) | Membuka adegan dari aliran tertentu |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream)(Stream, FileFormat, CancellationToken) | Membuka adegan dari aliran yang diberikan menggunakan format file yang ditentukan. |
| static [FromStream](../../aspose.threed/scene/fromstream/#fromstream_1)(Stream, LoadOptions, CancellationToken) | Membuka adegan dari aliran tertentu menggunakan konfigurasi IO tertentu. |
| [Clear](../../aspose.threed/scene/clear/)() | Menghapus konten adegan dan mengembalikan pengaturan default. |
| [CreateAnimationClip](../../aspose.threed/scene/createanimationclip/)(string) | Fungsi steno untuk membuat dan mendaftarkan[`AnimationClip`](../../aspose.threed.animation/animationclip/) Yang pertama[`AnimationClip`](../../aspose.threed.animation/animationclip/) akan ditugaskan ke[`CurrentAnimationClip`](./currentanimationclip/) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetAnimationClip](../../aspose.threed/scene/getanimationclip/)(string) | Mendapat nama[`AnimationClip`](../../aspose.threed.animation/animationclip/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [Open](../../aspose.threed/scene/open/#open)(Stream) | Membuka adegan dari aliran tertentu |
| [Open](../../aspose.threed/scene/open/#open_4)(string) | Membuka adegan dari jalur yang diberikan |
| [Open](../../aspose.threed/scene/open/#open_3)(Stream, CancellationToken) | Membuka adegan dari aliran tertentu |
| [Open](../../aspose.threed/scene/open/#open_8)(string, CancellationToken) | Membuka adegan dari jalur yang diberikan |
| [Open](../../aspose.threed/scene/open/#open_6)(string, LoadOptions) | Membuka adegan dari jalur yang diberikan menggunakan format file yang ditentukan. |
| [Open](../../aspose.threed/scene/open/#open_1)(Stream, FileFormat, CancellationToken) | Membuka adegan dari aliran yang diberikan menggunakan format file yang ditentukan. |
| [Open](../../aspose.threed/scene/open/#open_2)(Stream, LoadOptions, CancellationToken) | Membuka adegan dari aliran tertentu menggunakan konfigurasi IO tertentu. |
| [Open](../../aspose.threed/scene/open/#open_5)(string, FileFormat, CancellationToken) | Membuka adegan dari jalur yang diberikan menggunakan format file yang ditentukan. |
| [Open](../../aspose.threed/scene/open/#open_7)(string, LoadOptions, CancellationToken) | Membuka adegan dari jalur yang diberikan menggunakan format file yang ditentukan. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [Render](../../aspose.threed/scene/render/#render)(Camera, Bitmap) | Render adegan menjadi bitmap dari perspektif kamera tertentu. |
| [Render](../../aspose.threed/scene/render/#render_2)(Camera, string) | Render adegan menjadi file eksternal dari perspektif kamera tertentu. Ukuran output default adalah 1024x768 dan format output adalah png |
| [Render](../../aspose.threed/scene/render/#render_1)(Camera, Bitmap, ImageRenderOptions) | Render adegan menjadi bitmap dari perspektif kamera tertentu. |
| [Render](../../aspose.threed/scene/render/#render_3)(Camera, string, Size, ImageFormat) | Render adegan menjadi file eksternal dari perspektif kamera tertentu. |
| [Render](../../aspose.threed/scene/render/#render_4)(Camera, string, Size, ImageFormat, ImageRenderOptions) | Render adegan menjadi file eksternal dari perspektif kamera tertentu. |
| [Save](../../aspose.threed/scene/save/#save_4)(string) | Menyimpan adegan ke jalur yang ditentukan menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save)(Stream, FileFormat) | Menyimpan adegan untuk streaming menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save_2)(Stream, SaveOptions) | Menyimpan adegan untuk streaming menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save_5)(string, FileFormat) | Menyimpan adegan ke jalur yang ditentukan menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save_7)(string, SaveOptions) | Menyimpan adegan ke jalur yang ditentukan menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save_1)(Stream, FileFormat, CancellationToken) | Menyimpan adegan untuk streaming menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save_3)(Stream, SaveOptions, CancellationToken) | Menyimpan adegan untuk streaming menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save_6)(string, FileFormat, CancellationToken) | Menyimpan adegan ke jalur yang ditentukan menggunakan format file yang ditentukan. |
| [Save](../../aspose.threed/scene/save/#save_8)(string, SaveOptions, CancellationToken) | Menyimpan adegan ke jalur yang ditentukan menggunakan format file yang ditentukan. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |

### Lihat juga

* class [SceneObject](../sceneobject/)
* ruang nama [Aspose.ThreeD](../../aspose.threed/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
