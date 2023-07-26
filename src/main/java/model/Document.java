package model;

import lombok.*;

import java.util.List;

/**
 * @author  Mikhail Dedyukhin
 * @since  1.0
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Document {
    private Description description;
    private String doc_id;
    private String doc_status;
    private String doc_type;
    private boolean importRequest;
    private String participant_inn;
    private String producer_inn;
    private String production_date;
    private String production_type;
    private List<Products> products;
    private String reg_date;
    private String reg_number;
}
