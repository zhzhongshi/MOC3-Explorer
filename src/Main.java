import com.live2d.cubism.doc.model.exporter.CMocMemoryMapperV1;
import com.live2d.cubism.doc.model.exporter.EmMoc3Source;
import com.live2d.cubism.doc.model.exporter.EmModelSourcePack;

import java.io.File;
import java.util.List;

public class Main {

    private static final String BASE_PATH = "C:/Users/zhzhongshi/project/github/kalidokit/docs/models/hiyori/";

    public static void main(String[] args) {
        CMocMemoryMapperV1 mapper = new CMocMemoryMapperV1();
        EmMoc3Source source = mapper.read(new File(BASE_PATH + "hiyori_pro_t10.moc3"));
        // source.getEmSectionOffset().getOffsets().clear();
        // List<Byte> data = mapper.write(new EmModelSourcePack(source));
        // if (!data.isEmpty()) {
        //     System.out.println("ok");
        // }
        for(int i=0;i<source.getEmModelSource().getEmParameterSources().getSize();i++){
            System.out.println(source.getEmModelSource().getEmParameterSources().getID().get(i));
        }
    }
}
