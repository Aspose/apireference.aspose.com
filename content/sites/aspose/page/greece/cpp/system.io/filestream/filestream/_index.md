---
title: "System::IO::FileStream::FileStream κατασκευαστής"
linktitle: "FileStream"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τον κατασκευαστή FileStream της κλάσης System::IO::FileStream σε C++."
type: docs
weight: 100
url: /el/cpp/system.io/filestream/filestream/
---
## FileStream::FileStream(const FileStream\&) constructor




```cpp
System::IO::FileStream::FileStream(const FileStream &)=delete
```

## Δείτε επίσης

* Class [FileStream](../)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode) constructor


Δημιουργεί μια νέα παρουσία της κλάσης [FileStream](../) και την αρχικοποιεί με τις καθορισμένες παραμέτρους.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου προς άνοιγμα. |
| mode | FileMode | Καθορίζει τη λειτουργία με την οποία θα ανοίξει το αρχείο. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) constructor


Δημιουργεί μια νέα παρουσία της κλάσης [FileStream](../) και την αρχικοποιεί με τις καθορισμένες παραμέτρους.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share, int32_t buffer_size, bool useAsync)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου προς άνοιγμα. |
| mode | FileMode | Καθορίζει τη λειτουργία με την οποία θα ανοίξει το αρχείο. |
| access | FileAccess | Ο ζητούμενος τύπος πρόσβασης. |
| share | FileShare | Ο τύπος πρόσβασης που έχουν άλλα αντικείμενα [FileStream](../) στο ανοιχτό αρχείο. |
| buffer_size | int32_t | Ο αριθμός των byte που αποθηκεύονται σε buffer κατά τις λειτουργίες ανάγνωσης και εγγραφής. |
| useAsync | bool | Καθορίζει αν θα χρησιμοποιηθεί ασύγχρονη I/O ή συγχρονισμένη I/O. |
## Παρατηρήσεις



Το υποκείμενο λειτουργικό σύστημα ενδέχεται να μην υποστηρίζει ασύγχρονη I/O.

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## FileStream::FileStream(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) constructor


Δημιουργεί μια νέα παρουσία της κλάσης [FileStream](../) και την αρχικοποιεί με τις καθορισμένες παραμέτρους.

```cpp
System::IO::FileStream::FileStream(const String &path, FileMode mode, FileAccess access, FileShare share=FileShare::Read, int32_t buffer_size=DefaultBufferSize, FileOptions options=FileOptions::SequentialScan)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| path | const String\& | Η διαδρομή του αρχείου προς άνοιγμα. |
| mode | FileMode | Καθορίζει τη λειτουργία με την οποία θα ανοίξει το αρχείο. |
| access | FileAccess | Ο ζητούμενος τύπος πρόσβασης. |
| share | FileShare | Ο τύπος πρόσβασης που έχουν άλλα αντικείμενα [FileStream](../) στο ανοιχτό αρχείο. |
| buffer_size | int32_t | Ο αριθμός των byte που αποθηκεύονται σε buffer κατά τις λειτουργίες ανάγνωσης και εγγραφής. |
| επιλογές | FileOptions | Πρόσθετες επιλογές. |

## Δείτε επίσης

* Class [String](../../../system/string/)
* Enum [FileMode](../../filemode/)
* Enum [FileAccess](../../fileaccess/)
* Enum [FileShare](../../fileshare/)
* Enum [FileOptions](../../fileoptions/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
