package dev.senzalla.rectify.request;

import dev.senzalla.rectify.entitys.LabCarSplit;
import dev.senzalla.rectify.exception.DataBaseException;

import java.sql.SQLException;
import java.util.List;

public class LabCarSplitRequest extends Request<LabCarSplit> {
    @Override
    public void insert(LabCarSplit labCarSplit) {
        connection();
        try {
            final String sql = "INSERT INTO `db_retifica`.`tbl_labcarsplit` (`fkLabSplit`) VALUES (?);";
            prepareStatement(sql);
            stmt.setLong(1, labCarSplit.getLabSplit().getIdSplit());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            new DataBaseException().processMsg(ex.getMessage());
        } finally {
            closeConnection();
        }
    }

    @Override
    public List<LabCarSplit> select() {
        return null;
    }

    @Override
    public List<LabCarSplit> select(LabCarSplit labCarSplit) {
        return null;
    }

    @Override
    public List<LabCarSplit> select(List<String> clause, LabCarSplit labCarSplit) {
        return null;
    }
}