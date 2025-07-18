---
title: GzipArchive
second_title: Aspose.Zip for Python via .NET API Reference
description: 
type: docs
weight: 10
url: /python-net/aspose.zip.gzip/gziparchive/
---

## GzipArchive class

This class represents a gzip archive file. Use it to compose or extract gzip archives.

The GzipArchive type exposes the following members:
## Constructors
| Name | Description |
| :- | :- |
|GzipArchive()|Initializes a new instance of the [GzipArchive](/zip/python-net/aspose.zip.gzip/gziparchive/) class prepared for compressing.|
|GzipArchive(source_stream, parse_header)|Initializes a new instance of the [GzipArchive](/zip/python-net/aspose.zip.gzip/gziparchive/) class prepared for decompressing.|
|GzipArchive(source_stream, options)|Initializes a new instance of the [GzipArchive](/zip/python-net/aspose.zip.gzip/gziparchive/) class prepared for decompressing.|
|GzipArchive(path, options)|Initializes a new instance of the [GzipArchive](/zip/python-net/aspose.zip.gzip/gziparchive/) class prepared for decompressing.|
|GzipArchive(path, parse_header)|Initializes a new instance of the [GzipArchive](/zip/python-net/aspose.zip.gzip/gziparchive/) class prepared for decompressing.|
## Properties
| Name | Description |
| :- | :- |
|uncompressed_size|Gets size of an original file.|
|name|Name of the original file.|
|file_entries|Gets entries of [IArchiveFileEntry](/zip/python-net/aspose.zip/iarchivefileentry/) type constituting the archive.|
|format|Gets the archive format.|
|length|Gets the length of the entry in bytes.|
## Methods
| Name | Description |
| :- | :- |
|set_source(source)|Sets the content to be compressed within the archive.|
|set_source(path)|Sets the content to be compressed within the archive.|
|set_source(tar_archive)|Sets the content to be compressed within the archive.|
|extract(destination)|Extracts the archive to the stream provided.|
|extract(path)|Extracts content of the archive to the directory provided.|
|save(output_stream)|Saves archive to the stream provided.|
|save(destination_file_name)|Saves archive to the destination file provided.|
|open()|Opens the archive for extraction and provides a stream with archive content.|
|extract_to_directory(destination_directory)|Extracts content of the archive to the directory provided.|

### See Also

* namespace [aspose.zip.gzip](/zip/python-net/aspose.zip.gzip/)
* assembly [Aspose.Zip](/zip/python-net/)

