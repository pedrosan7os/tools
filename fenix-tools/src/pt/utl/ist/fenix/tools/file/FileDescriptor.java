package pt.utl.ist.fenix.tools.file;

public class FileDescriptor {

    private String filename;

    private String mimeType;

    private String checksum;

    private String checksumAlgorithm;

    private int size;

    private String uniqueId;

    public FileDescriptor(String filename, String mimeType, String checksum, String checksumAlgorithm,
            int size, String uniqueId) {
        this.filename = filename;
        this.mimeType = mimeType;
        this.checksum = checksum;
        this.checksumAlgorithm = checksumAlgorithm;
        this.size = size;
        this.uniqueId = uniqueId;
    }

    /**
     * The file checksum
     * 
     * @return
     */
    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    /**
     * The algorithm used to calculate the checksum
     * 
     * @return
     */
    public String getChecksumAlgorithm() {
        return checksumAlgorithm;
    }

    public void setChecksumAlgorithm(String checksumAlgorithm) {
        this.checksumAlgorithm = checksumAlgorithm;
    }

    /**
     * The filename only
     * 
     * @return
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * The mime type
     * 
     * @return
     */
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * The file size
     * 
     * @return
     */
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /**
     * An unique Id, i.e., an identification that allows direct file access. On
     * local disk can be the full system path to file (/a/b/c/d/e/theFile.jpg).
     * On other content repositories will typically be the path (or equivalent)
     * to the file.
     * 
     * @return
     */
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

}
