---
title: FileFormat
second_title: Aspose.3D για Αναφορά API .NET
description: Ορισμός μορφής αρχείου
type: docs
weight: 1000
url: /el/net/aspose.threed/fileformat/
---
## FileFormat class

Ορισμός μορφής αρχείου

```csharp
public class FileFormat
```

## Ιδιότητες

| Ονομα | Περιγραφή |
| --- | --- |
| [CanExport](../../aspose.threed/fileformat/canexport/) { get; } | Λαμβάνει εάν το Aspose.3D υποστηρίζει εξαγωγή σκηνής στην τρέχουσα μορφή αρχείου. |
| [CanImport](../../aspose.threed/fileformat/canimport/) { get; } | Βρίσκει εάν το Aspose.3D υποστηρίζει σκηνή εισαγωγής από την τρέχουσα μορφή αρχείου. |
| [ContentType](../../aspose.threed/fileformat/contenttype/) { get; } | Λαμβάνει μορφή αρχείου τύπου περιεχομένου |
| [Extension](../../aspose.threed/fileformat/extension/) { get; } | Λαμβάνει το όνομα επέκτασης αυτού του τύπου. |
| [Extensions](../../aspose.threed/fileformat/extensions/) { get; } | Λαμβάνει τα ονόματα των επεκτάσεων αυτού του τύπου. |
| [FileFormatType](../../aspose.threed/fileformat/fileformattype/) { get; } | Λαμβάνει μορφή αρχείου type |
| [Version](../../aspose.threed/fileformat/version/) { get; } | Λαμβάνει μορφή αρχείου version |

## Μέθοδοι

| Ονομα | Περιγραφή |
| --- | --- |
| static [Detect](../../aspose.threed/fileformat/detect/#detect_1)(string) | Εντοπίστε τη μορφή αρχείου από το όνομα αρχείου, το αρχείο πρέπει να είναι αναγνώσιμο, ώστε το Aspose.3D να μπορεί να εντοπίσει τη μορφή αρχείου μέσω της κεφαλίδας του αρχείου. |
| static [Detect](../../aspose.threed/fileformat/detect/#detect)(Stream, string) | Εντοπίστε τη μορφή αρχείου από τη ροή δεδομένων, το όνομα αρχείου είναι προαιρετικό για να μαντέψετε τύπους που δεν έχουν μαγική κεφαλίδα. |
| static [GetFormatByExtension](../../aspose.threed/fileformat/getformatbyextension/)(string) | Λαμβάνει την προτιμώμενη μορφή αρχείου από την επέκταση αρχείου name Το όνομα της επέκτασης πρέπει να ξεκινά με μια τελεία('.'). |
| [CreateLoadOptions](../../aspose.threed/fileformat/createloadoptions/)() | Δημιουργήστε προεπιλεγμένες επιλογές φόρτωσης για αυτήν τη μορφή αρχείου |
| [CreateSaveOptions](../../aspose.threed/fileformat/createsaveoptions/)() | Δημιουργήστε προεπιλεγμένες επιλογές αποθήκευσης για αυτήν τη μορφή αρχείου |
| override [ToString](../../aspose.threed/fileformat/tostring/)() | Μορφοποιεί σε string |

## Πεδία

| Ονομα | Περιγραφή |
| --- | --- |
| static readonly [AMF](../../aspose.threed/fileformat/amf/) | Μορφή αρχείου κατασκευής πρόσθετων |
| static readonly [ASE](../../aspose.threed/fileformat/ase/) | Μορφή ASCII Scene Exporter του 3D Studio Max. |
| static readonly [Aspose3DWeb](../../aspose.threed/fileformat/aspose3dweb/) | Aspose.3D μορφή Ιστού. |
| static readonly [Collada](../../aspose.threed/fileformat/collada/) | Μορφή αρχείου Collada |
| static readonly [Discreet3DS](../../aspose.threed/fileformat/discreet3ds/) | Μορφή αρχείου του 3D Studio |
| static readonly [DXF](../../aspose.threed/fileformat/dxf/) | AutoCAD DXF |
| static readonly [FBX6100ASCII](../../aspose.threed/fileformat/fbx6100ascii/) | Μορφή αρχείου ASCII FBX, με έκδοση 6.1.0 |
| static readonly [FBX6100Binary](../../aspose.threed/fileformat/fbx6100binary/) | Μορφή δυαδικού αρχείου FBX, με έκδοση 6.1.0 |
| static readonly [FBX7200ASCII](../../aspose.threed/fileformat/fbx7200ascii/) | Μορφή αρχείου ASCII FBX, με έκδοση 7.2.0 |
| static readonly [FBX7200Binary](../../aspose.threed/fileformat/fbx7200binary/) | Μορφή δυαδικού αρχείου FBX, με έκδοση 7.2.0 |
| static readonly [FBX7300ASCII](../../aspose.threed/fileformat/fbx7300ascii/) | Μορφή αρχείου ASCII FBX, με έκδοση 7.3.0 |
| static readonly [FBX7300Binary](../../aspose.threed/fileformat/fbx7300binary/) | Μορφή δυαδικού αρχείου FBX, με έκδοση 7.3.0 |
| static readonly [FBX7400ASCII](../../aspose.threed/fileformat/fbx7400ascii/) | Μορφή αρχείου ASCII FBX, με έκδοση 7.4.0 |
| static readonly [FBX7400Binary](../../aspose.threed/fileformat/fbx7400binary/) | Μορφή δυαδικού αρχείου FBX, με έκδοση 7.4.0 |
| static readonly [FBX7500ASCII](../../aspose.threed/fileformat/fbx7500ascii/) | Μορφή αρχείου ASCII FBX, με έκδοση 7.5.0 |
| static readonly [FBX7500Binary](../../aspose.threed/fileformat/fbx7500binary/) | Μορφή δυαδικού αρχείου FBX, με έκδοση 7.5.0 |
| static readonly [FBX7600ASCII](../../aspose.threed/fileformat/fbx7600ascii/) | Μορφή αρχείου ASCII FBX, με έκδοση 7.6.0 |
| static readonly [FBX7600Binary](../../aspose.threed/fileformat/fbx7600binary/) | Μορφή δυαδικού αρχείου FBX, με έκδοση 7.6.0 |
| static readonly [FBX7700ASCII](../../aspose.threed/fileformat/fbx7700ascii/) | Μορφή αρχείου ASCII FBX, με έκδοση 7.7.0 |
| static readonly [FBX7700Binary](../../aspose.threed/fileformat/fbx7700binary/) | Μορφή δυαδικού αρχείου FBX, με έκδοση 7.7.0 |
| static readonly [GLTF](../../aspose.threed/fileformat/gltf/) | glTF του Ομίλου Khronos |
| static readonly [GLTF2](../../aspose.threed/fileformat/gltf2/) | Έκδοση glTF 2.0 του Ομίλου Khronos |
| static readonly [GLTF2_Binary](../../aspose.threed/fileformat/gltf2_binary/) | Έκδοση glTF 2.0 του Ομίλου Khronos |
| static readonly [GLTF_Binary](../../aspose.threed/fileformat/gltf_binary/) | Το glTF του Ομίλου Khronos σε δυαδική μορφή |
| static readonly [HTML5](../../aspose.threed/fileformat/html5/) | Αρχείο HTML5 |
| static readonly [MayaASCII](../../aspose.threed/fileformat/mayaascii/) | Autodesk Maya σε μορφή ASCII |
| static readonly [MayaBinary](../../aspose.threed/fileformat/mayabinary/) | Autodesk Maya σε δυαδική μορφή |
| static readonly [Microsoft3MF](../../aspose.threed/fileformat/microsoft3mf/) | Microsoft 3D Manufacturing Format |
| static readonly [Pcd](../../aspose.threed/fileformat/pcd/) | Αρχείο δεδομένων PCL Point Cloud σε λειτουργία ASCII |
| static readonly [PcdBinary](../../aspose.threed/fileformat/pcdbinary/) | Αρχείο δεδομένων PCL Point Cloud σε δυαδική λειτουργία |
| static readonly [SiemensJT8](../../aspose.threed/fileformat/siemensjt8/) | Έκδοση αρχείου Siemens JT 8 |
| static readonly [SiemensJT9](../../aspose.threed/fileformat/siemensjt9/) | Έκδοση αρχείου Siemens JT 9 |
| static readonly [STLASCII](../../aspose.threed/fileformat/stlascii/) | Μορφή αρχείου ASCII STL |
| static readonly [STLBinary](../../aspose.threed/fileformat/stlbinary/) | Μορφή αρχείου δυαδικού STL |
| static readonly [Universal3D](../../aspose.threed/fileformat/universal3d/) | Μορφή αρχείου Universal3D |
| static readonly [USD](../../aspose.threed/fileformat/usd/) | Περιγραφή Universal Scene |
| static readonly [USDZ](../../aspose.threed/fileformat/usdz/) | Συμπιεσμένη Universal Scene Description |
| static readonly [VRML](../../aspose.threed/fileformat/vrml/) | The Virtual Reality Modeling Language |
| static readonly [WavefrontOBJ](../../aspose.threed/fileformat/wavefrontobj/) | Μορφή αρχείου Obj του Wavefront |
| static readonly [XBinary](../../aspose.threed/fileformat/xbinary/) | Αρχείο DirectX X σε δυαδική μορφή |
| static readonly [XText](../../aspose.threed/fileformat/xtext/) | Αρχείο DirectX X σε δυαδική μορφή |
| static readonly [Xyz](../../aspose.threed/fileformat/xyz/) | Αρχείο νέφους σημείου Xyz |
| static readonly [Zip](../../aspose.threed/fileformat/zip/) | Αρχείο Zip που περιέχει άλλη μορφή αρχείου 3d. |
| static readonly [Draco](../../aspose.threed/fileformat/draco/) | Google Draco Mesh |
| static readonly [PDF](../../aspose.threed/fileformat/pdf/) | Μορφή φορητού εγγράφου της Adobe |
| static readonly [PLY](../../aspose.threed/fileformat/ply/) | Μορφή αρχείου πολυγώνου ή Μορφή τριγώνου Stanford |
| static readonly [RvmBinary](../../aspose.threed/fileformat/rvmbinary/) | Μοντέλο συστήματος διαχείρισης σχεδιασμού εγκαταστάσεων AVEVA σε δυαδική μορφή |
| static readonly [RvmText](../../aspose.threed/fileformat/rvmtext/) | Μοντέλο συστήματος διαχείρισης σχεδιασμού εγκαταστάσεων AVEVA σε μορφή κειμένου |

### Δείτε επίσης

* χώρος ονομάτων [Aspose.ThreeD](../../aspose.threed/)
* συνέλευση [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
